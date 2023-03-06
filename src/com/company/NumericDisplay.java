package com.company;

public class NumericDisplay implements Observer {
    private int value;

    public NumericDisplay() {
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current value = " + value);
    }
}
