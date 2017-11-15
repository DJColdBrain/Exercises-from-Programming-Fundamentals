package BirthdayCelebrations;

public class Citizen implements Identifiable , Birthable{

    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
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

    public String getBirthYear() {
        return this.birthdate.split("/")[2];
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public boolean isBirthdayYear(String year) {
        if (year.equals(getBirthYear())){
            return true;
        }
        return false;
    }
}
