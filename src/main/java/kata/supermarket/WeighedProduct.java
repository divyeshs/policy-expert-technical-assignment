package kata.supermarket;

import java.math.BigDecimal;

public class WeighedProduct {

    private final BigDecimal pricePerKilo;
    private DiscountScheme discountScheme;

    public WeighedProduct(final BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
        this.discountScheme = new NoDiscountScheme();
    }

    public WeighedProduct(final BigDecimal pricePerKilo, final DiscountScheme discountScheme) {
        this.pricePerKilo = pricePerKilo;
        this.discountScheme = discountScheme;
    }

    BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    DiscountScheme discountScheme() {
        return discountScheme;
    }

    public Item weighing(final BigDecimal kilos) {
        return new ItemByWeight(this, kilos);
    }
}
