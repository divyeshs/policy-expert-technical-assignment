# Notes

Here is a quick summary of discount scheme implementation.

- A new interface called 'DiscountScheme' was added. This interface checks if discount is applicable for current items in basket.
And if discount is applicable then interface also provides a method to calculate discount based on discount schement.

- Each product has a discount scheme assigned to it. Buy default no discount is applied to product.

- Implementation for one of the discount schemes (BuyOneGetOneFreeDiscountScheme) from the requirements is provided as part of this exercise.

- Further discount schemes can be implemented similarly to BuyOneGetOneFreeDiscountScheme.

- Updated implementation for 'discounts()' methoed in Basket class

- Added unit test named "multiple items priced per unit with buy one get one free discount" for BuyOneGetOneFreeDiscountScheme in BasketTest.java