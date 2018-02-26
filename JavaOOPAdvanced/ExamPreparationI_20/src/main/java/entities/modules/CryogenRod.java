package entities.modules;

import interfaces.EnergyModule;

public class CryogenRod extends AbstractModule implements EnergyModule {


    private int energyOutput;

    public CryogenRod(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }
}
