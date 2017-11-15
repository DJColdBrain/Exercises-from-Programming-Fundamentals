package FoodShortage;

public interface Identifiable {

    boolean isFakeId(String lastBit);
    String getId();
}
