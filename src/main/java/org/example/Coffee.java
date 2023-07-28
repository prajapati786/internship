package org.example;

public abstract class Coffee {
    private int quantity;

    public abstract Coffee prepare();

//    public abstract Coffee prepare();

    public abstract int getPrice();

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
}
