package ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private Double money;
    private List<Product> products;

    Person(String data){
        String[] details = data.split("=");
        setName(details[0]);
        setMoney(Double.parseDouble(details[1]));
        products = new ArrayList<>();
    }

    private void setName(String name){
        if (name.trim().length() < 1){
            throw new IllegalArgumentException("Name cannot be empty");
        }else{
            this.name = name.trim();
        }
    }

    private void  setMoney(Double money){
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else{
            this.money = money;
        }
    }

    public void addProduct(Product product){
        if (this.money - product.getPrice() < 0){
            System.out.println(this.name + " can't afford " + product.getName());
        }else{
            this.products.add(product);
            this.money -= product.getPrice();
            System.out.println(this.name + " bought "+ product.getName());
        }
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    public String getName() {
        return name;
    }

}
