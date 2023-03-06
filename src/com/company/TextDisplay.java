package com.company;

public class TextDisplay implements Observer{
    private int value;

    public TextDisplay() {
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    @Override
    public void display() {
        if(this.value < 20)
            System.out.println("cold");
        else
            System.out.println("warm");
    }
}
