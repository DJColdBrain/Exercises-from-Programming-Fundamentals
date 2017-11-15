package mordorsCrueltyPlan;

public class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    private String getName() {
        return name.toLowerCase();
    }

    int getHappynesFromFood(){
        switch (getName()){
            case "cram":
                return 2;
            case "lembas":
                return 3;
            case "apple":
                return 1;
            case "melon":
                return 1;
            case "honeycake":
                return 5;
            case "mushrooms":
                return -10;
                default:
                    return -1;
        }
    }
}
