package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountScheme {
    BigDecimal calculateDiscount(BigDecimal price);
    boolean isApplicableTo(List<Item> basketItems);
}
