package wildFarm.food;

public abstract class Food {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
