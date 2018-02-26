package entities.reactors;

import interfaces.Container;

public class HeatReactor extends AbstractReactor {


    private int heatReductionIndex;

    public HeatReactor(Container container, int id, int heatReductionIndex) {
        super(container, id);
        this.heatReductionIndex = heatReductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        long result = getContainer().getTotalEnergyOutput() ;
        if (result > this.getTotalHeatAbsorbing()){
            return 0;
        }
        return result;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return getContainer().getTotalHeatAbsorbing() + this.heatReductionIndex;
    }
}
