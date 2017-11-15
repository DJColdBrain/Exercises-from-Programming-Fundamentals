package mordorsCrueltyPlan;

public class Gandalf {

    private int happynes;

    public Gandalf(String[] food) {
        this.happynes = 0;
        addAllFood(food);
    }
    
    private void addAllFood(String[] food){
        for (String s : food) {
            Food food1 = new Food(s);
            this.happynes += food1.getHappynesFromFood();
        }
    }

    public String getMood() {
        if (this.happynes < -5){
            return "Angry";
        }else if (this.happynes < 0){
            return "Sad";
        }else if (this.happynes < 15){
            return "Happy";
        }else{
            return "JavaScript";
        }
    }

    @Override
    public String toString() {
        return this.happynes + "\n" + getMood();
    }
}
