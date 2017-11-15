package FoodShortage;

public class Pet implements Birthable {

    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getBirthYear() {
        return this.birthdate.split("/")[2];
    }


    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    public boolean isBirthdayYear(String year) {
        if (year.equals(getBirthYear())){
            return true;
        }
        return false;
    }
}
