package cells;

public class Fungi extends Microbe {
    public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    protected int getEnergy(){
        return (getHealth() + getVirulence())  / 4;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n--------Health: "+ getHealth() +" | Virulence: "+ getVirulence() +" | Energy: " + getEnergy() ;
    }
}
