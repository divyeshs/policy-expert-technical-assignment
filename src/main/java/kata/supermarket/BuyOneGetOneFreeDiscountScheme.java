package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public class BuyOneGetOneFreeDiscountScheme implements DiscountScheme {

    public BigDecimal calculateDiscount(BigDecimal price) {
        return price.divide(new BigDecimal(2));
    }

    public boolean isApplicableTo(List<Item> items) {
        if (items.stream().map(Item::discountScheme)
                .filter(discountScheme -> discountScheme instanceof BuyOneGetOneFreeDiscountScheme)
                .count() % 2 == 0)
            return true;
        else
            return false;
    }
}
