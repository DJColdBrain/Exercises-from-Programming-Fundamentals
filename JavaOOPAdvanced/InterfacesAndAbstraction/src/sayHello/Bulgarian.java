package sayHello;

public class Bulgarian implements Person {

    private String name;

    public Bulgarian(String name) {
        setName(name);
    }

    private void setName(String name){
        this.name = name;
    }


    @Override

    public String getName() {
        return "Здравей";
    }

    @Override
    public String sayHello() {
        return this.name;
    }
}
