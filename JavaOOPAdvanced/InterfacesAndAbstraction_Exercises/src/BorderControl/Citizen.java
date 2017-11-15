package BorderControl;

public class Citizen implements Identifiable{

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean isFakeId(String lastBit) {
        String lastBitId = this.id.substring(this.id.length() - lastBit.length() );
        if (lastBit.equals(lastBitId)){
            return true;
        }
        return false;
    }
}
