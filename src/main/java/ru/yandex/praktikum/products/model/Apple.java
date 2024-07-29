package ru.yandex.praktikum.products.model;

import static ru.yandex.praktikum.products.model.constants.Colour.RED_APPLE;
import static ru.yandex.praktikum.products.model.constants.Discount.DISCOUNT_ALL;
import static ru.yandex.praktikum.products.model.constants.Discount.DISCOUNT_RED_APPLE;

public class Apple extends Food {
    String colour;
    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)) {
            return DISCOUNT_RED_APPLE;
        } else {
            return DISCOUNT_ALL;
        }
    }
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
}
