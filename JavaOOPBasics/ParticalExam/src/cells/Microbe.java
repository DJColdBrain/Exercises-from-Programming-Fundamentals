package cells;


public abstract class Microbe extends Cell {

    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        setVirulence(virulence);
    }

    private void setVirulence(int virulence) {
        if (virulence <= 0){
            throw new IllegalArgumentException("");
        }
        this.virulence = virulence;
    }

    protected int getVirulence() {
        return virulence;
    }

}
