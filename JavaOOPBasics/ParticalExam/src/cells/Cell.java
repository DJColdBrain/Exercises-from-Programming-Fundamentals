package cells;

public abstract class Cell {
    private String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public Cell(String id, int health, int positionRow, int positionCol) {
        setId(id);
        setHealth(health);
        setPositionRow(positionRow);
        setPositionCol(positionCol);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setHealth(int health) {
        if (health <= 0){
            throw new IllegalArgumentException("");
        }
        this.health = health;
    }

    private void setPositionRow(int positionRow) {
        if (positionRow < 0){
            throw new IllegalArgumentException("");
        }
        this.positionRow = positionRow;
    }

    private void setPositionCol(int positionCol) {
        if (positionCol < 0){
            throw new IllegalArgumentException("");
        }
        this.positionCol = positionCol;
    }

    protected int getHealth() {
        return health;
    }

    protected int getPositionRow() {
        return positionRow;
    }

    protected int getPositionCol() {
        return positionCol;
    }

    public void consume(Cell cell){
        this.health += cell.getHealth();
        this.positionRow = cell.getPositionRow();
        this.positionCol = cell.getPositionCol();
    }

    public void kill(Cell cell){
        this.positionRow = cell.getPositionRow();
        this.positionCol = cell.getPositionCol();
    }

    private void takeDamage(int dmg){
        this.health -= dmg;
    }

    protected int getEnergy(){
        return  0;
    }

    public void attack(Cell cell){
        cell.takeDamage(getEnergy());
    }

    @Override
    public String toString() {
        return "\n------Cell "+ id +" [" + positionRow+","+ positionCol+"]";
    }
}
