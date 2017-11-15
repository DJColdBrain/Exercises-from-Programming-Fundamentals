package sayHello;

public class Chinese implements Person {

    private String name;

    public Chinese(String name) {
        setName(name);
    }

    private void setName(String name){
        this.name = name;
    }


    @Override

    public String getName() {
        return "Djydjybydjy";
    }

    @Override
    public String sayHello() {
        return this.name;
    }
}
