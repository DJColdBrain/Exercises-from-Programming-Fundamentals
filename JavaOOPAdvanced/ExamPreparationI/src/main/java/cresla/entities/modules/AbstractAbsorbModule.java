package cresla.entities.modules;

import cresla.interfaces.AbsorbingModule;

public  abstract class AbstractAbsorbModule  extends AbstractModule implements AbsorbingModule{

    private int heatAbsorbing;

    public AbstractAbsorbModule(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Module - " + super.getId() + System.lineSeparator() +
                "Heat Absorbing: " + this.heatAbsorbing + System.lineSeparator() ;
    }

}
