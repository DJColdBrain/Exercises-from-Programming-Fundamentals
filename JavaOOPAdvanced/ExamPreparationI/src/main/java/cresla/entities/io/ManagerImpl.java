package cresla.entities.io;

import cresla.entities.containers.ModuleContainer;
import cresla.entities.modules.CooldownSystem;
import cresla.entities.modules.CryogenRod;
import cresla.entities.modules.HeatProcessor;
import cresla.entities.reactors.CryoReactor;
import cresla.entities.reactors.HeatReactor;
import cresla.interfaces.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {

    private Map<Integer, Reactor> reactorMap;
    private Map<Integer, Module> moduleMap;
    private int id;

    private int energyModulesCounter;
    private int absorbingModulesCounter;
    private int cryoReactorCounter;
    private int heatReactorCounter;

    public ManagerImpl() {
        this.reactorMap = new HashMap<>();
        this.moduleMap = new HashMap<>();
        this.id = 1;
        this.energyModulesCounter = 0;
        this.absorbingModulesCounter = 0;
        this.cryoReactorCounter = 0;
        this.heatReactorCounter = 0;
    }

    @Override
    public String reactorCommand(List<String> arguments) {
        Container container = new ModuleContainer(Integer.valueOf(arguments.get(3)));
        if ("Cryo".equalsIgnoreCase(arguments.get(1))) {
            this.reactorMap.put(this.id, new CryoReactor(container, this.id, Integer.valueOf(arguments.get(2))));
            cryoReactorCounter++;
        } else {
            this.reactorMap.put(this.id, new HeatReactor(container, this.id, Integer.valueOf(arguments.get(2))));
            heatReactorCounter++;
        }
        return "Created " + arguments.get(1) + " Reactor - " + this.id++ + System.lineSeparator();
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        int reactorId = Integer.parseInt(arguments.get(1));
        int aditionalParam =Integer.parseInt(arguments.get(3));
        switch (arguments.get(2)){
            case "CryogenRod":
                EnergyModule module = new CryogenRod(this.id, aditionalParam);
                this.reactorMap.get(reactorId).addEnergyModule(module);
                this.moduleMap.put(this.id, module);
                this.energyModulesCounter++;
                break;
            case "HeatProcessor":
                AbsorbingModule module1 = new HeatProcessor(this.id, aditionalParam);
                this.reactorMap.get(reactorId).addAbsorbingModule(module1);
                this.moduleMap.put(this.id, module1);
                this.absorbingModulesCounter++;
                break;
            case "CooldownSystem":
                AbsorbingModule module2 = new CooldownSystem(this.id, aditionalParam);
                this.reactorMap.get(reactorId).addAbsorbingModule(module2);
                this.moduleMap.put(this.id, module2);
                this.absorbingModulesCounter++;
                break;
                default:
                    break;
        }
        return "Added " + arguments.get(2) + " - " + this.id++ + " to Reactor - " + reactorId + System.lineSeparator();
    }

    @Override
    public String reportCommand(List<String> arguments) {
        int targerId = Integer.valueOf(arguments.get(1));
        if (reactorMap.containsKey(targerId)){
            return reactorMap.get(targerId).toString();
        }else {
            if  (moduleMap.containsKey(targerId)) {
                return moduleMap.get(targerId).toString();
            }else{
                return null;
            }
        }
    }

    @Override
    public String exitCommand(List<String> arguments) {
        long totalEnergy = this.reactorMap.values().stream().mapToLong(r -> r.getTotalEnergyOutput()).sum();
        long totalAbsorbing = this.reactorMap.values().stream().mapToLong(r -> r.getTotalHeatAbsorbing()).sum();

        return "Cryo Reactors: " + this.cryoReactorCounter + System.lineSeparator() +
        "Heat Reactors: " + this.heatReactorCounter + System.lineSeparator() +
        "Energy Modules: " + this.energyModulesCounter + System.lineSeparator() +
        "Absorbing Modules: " + this.absorbingModulesCounter + System.lineSeparator() +
        "Total Energy Output: " + totalEnergy + System.lineSeparator() +
        "Total Heat Absorbing: " + totalAbsorbing + System.lineSeparator();
    }
}
