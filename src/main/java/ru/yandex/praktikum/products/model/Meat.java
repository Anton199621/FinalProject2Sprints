package ru.yandex.praktikum.products.model;

import static ru.yandex.praktikum.products.model.constants.Discount.DISCOUNT_ALL;

public class Meat extends Food {
    @Override
    public double getDiscount() {
        return DISCOUNT_ALL;
    }
    public Meat (int amount, double price) {
        super(amount, price, false);
    }
}