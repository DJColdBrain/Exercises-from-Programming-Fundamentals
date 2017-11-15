package cells;

public class RedBloodCell extends BloodCell {
    private int velocity;


    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        setVelocity(velocity);
    }

    private void setVelocity(int velocity) {
        if (velocity <= 0){
            throw new IllegalArgumentException("");
        }
        this.velocity = velocity;
    }

    protected int getEnergy(){
        return getHealth() + velocity;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n--------Health: "+ getHealth() +" | Velocity: "+ velocity +" | Energy: " + getEnergy() ;
    }
}
