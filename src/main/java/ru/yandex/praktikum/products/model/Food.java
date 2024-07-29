package ru.yandex.praktikum.products.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    public int getAmount() {
        return amount;
    }
    public int getPrice() {
        return amount;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
}