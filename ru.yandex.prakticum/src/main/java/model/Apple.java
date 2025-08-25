package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // Яблоки вегетарианские
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.APPLE_DISCOUNT;
        }
        return 0;
    }
}