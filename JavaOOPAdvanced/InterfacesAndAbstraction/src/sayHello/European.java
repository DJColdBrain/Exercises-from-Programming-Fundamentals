package sayHello;

public class European implements Person {

    private String name;

    public European(String name) {
        setName(name);
    }

    private void setName(String name){
        this.name = name;
    }


    @Override

    public String getName() {
        return "Hello";
    }

    @Override
    public String sayHello() {
        return this.name;
    }
}
