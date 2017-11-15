package FoodShortage;

public class Robot implements Identifiable {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
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
