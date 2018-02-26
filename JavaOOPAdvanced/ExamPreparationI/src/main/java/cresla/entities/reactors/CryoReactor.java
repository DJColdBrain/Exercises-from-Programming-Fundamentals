package cresla.entities.reactors;

import cresla.interfaces.Container;

public class CryoReactor extends AbstractReactor {

    private int cryoProductionIndex;

    public CryoReactor(Container container, int id, int index){
        super(container, id);
        this.cryoProductionIndex = index;
    }

    @Override
    public long getTotalEnergyOutput() {
        long result = getContainer().getTotalEnergyOutput() * this.cryoProductionIndex;
        if (result > this.getTotalHeatAbsorbing()){
            return 0;
        }
        return result;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return getContainer().getTotalHeatAbsorbing();
    }

//    @Override
//    public String toString() {
//        return this.getClass().getSimpleName() +" - " + getId() + System.lineSeparator() +
//                "Energy Output: " + this.getTotalEnergyOutput() + System.lineSeparator() +
//                "Heat Absorbing: " + this.getTotalHeatAbsorbing()  + System.lineSeparator() +
//                "Modules: " + this.getModuleCount() + System.lineSeparator();
//
//    }
}
