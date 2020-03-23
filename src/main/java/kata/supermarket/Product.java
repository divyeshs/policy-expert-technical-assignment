package kata.supermarket;

import java.math.BigDecimal;

public class Product {

    private final BigDecimal pricePerUnit;
    private DiscountScheme discountScheme;

    public Product(final BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        this.discountScheme = new NoDiscountScheme();
    }

    public Product(final BigDecimal pricePerUnit, final DiscountScheme discountScheme) {
        this.pricePerUnit = pricePerUnit;
        this.discountScheme = discountScheme;
    }

    BigDecimal pricePerUnit() {
        return pricePerUnit;
    }

    DiscountScheme discountScheme() {
        return discountScheme;
    }

    public Item oneOf() {
        return new ItemByUnit(this);
    }
}
