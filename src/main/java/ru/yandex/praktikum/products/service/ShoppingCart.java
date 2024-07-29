package ru.yandex.praktikum.products.service;

import ru.yandex.praktikum.products.model.Food;

public class ShoppingCart {
    private final Food[] foods;
    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food food : foods) {
            int amount = food.getAmount();
            double price = food.getPrice();
            totalPrice = amount * price;
        }
        return totalPrice;
    }
    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food food : foods) {
            int amount = food.getAmount();
            double price = food.getPrice();
            double discount = food.getDiscount();
            totalPriceWithDiscount = (amount * price * (1 - discount));
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                int amount = food.getAmount();
                double price = food.getPrice();
                totalPriceIsVegetarian = amount * price;
            }
        }
        return totalPriceIsVegetarian;
    }
}