package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public class NoDiscountScheme implements DiscountScheme {
    public BigDecimal calculateDiscount(BigDecimal price) {
        return BigDecimal.ZERO;
    }

    public boolean isApplicableTo(List<Item> items) {
        return true;
    }
}
