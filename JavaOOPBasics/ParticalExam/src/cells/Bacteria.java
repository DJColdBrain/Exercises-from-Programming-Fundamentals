package cells;

public class Bacteria extends Microbe {
    public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }


    protected int getEnergy(){
        return (getHealth() + getVirulence()) / 3;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n--------Health: "+ getHealth() +" | Virulence: "+ getVirulence() +" | Energy: " + getEnergy() ;
    }
}
