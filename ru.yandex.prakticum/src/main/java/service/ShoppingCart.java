package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                double discount = discountable.getDiscount();
                total += item.getAmount() * item.getPrice() * (1 - discount / 100);
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}