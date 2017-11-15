package cells;

public class WhiteBloodCell extends BloodCell {

    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        setSize(size);
    }

    private void setSize(int size) {
        if (size <= 0){
            throw new IllegalArgumentException("");
        }
        this.size = size;
    }

    protected int getEnergy(){
        return (getHealth() + size) * 2;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n--------Health: "+ getHealth() +" | Size: "+ size +" | Energy: " + getEnergy() ;
    }
}
