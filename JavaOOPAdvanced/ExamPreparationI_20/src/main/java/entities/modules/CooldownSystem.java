package entities.modules;

import interfaces.AbsorbingModule;

public class CooldownSystem extends AbstractModule implements AbsorbingModule {

    private int heatAbsorbing;

    public CooldownSystem(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }
}
