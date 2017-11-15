package bookShop;

import java.math.BigDecimal;

public class GoldenEditionBook extends Book{

    GoldenEditionBook(String author, String title, BigDecimal price) {
        super(author, title, price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(super.getPrice().multiply(new BigDecimal(0.3)));
    }
}
