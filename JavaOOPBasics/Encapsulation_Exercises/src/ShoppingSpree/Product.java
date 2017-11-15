package ShoppingSpree;

public class Product {
    private String name;
    private  double price;

    Product(String data){
        String[] details = data.split("=");
        setName(details[0]);
        setMoney(Double.parseDouble(details[1]));
    }

    private void setName(String name){
        if (name.trim().length() < 1){
            throw new IllegalArgumentException("Name cannot be empty");
        }else{
            this.name = name.trim();
        }
    }

    private void setMoney(Double price){
        if (price < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else{
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
