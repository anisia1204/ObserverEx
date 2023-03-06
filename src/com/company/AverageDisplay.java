package com.company;

import java.util.ArrayList;

public class AverageDisplay implements Observer{
    private int value;
    private ArrayList<Integer> temperatureHistory;

    public AverageDisplay() {
        this.temperatureHistory = new ArrayList<Integer>();
    }

    @Override
    public void update(int value) {
        this.value = value;
        temperatureHistory.add(value);
        display();
    }

    @Override
    public void display() {
        System.out.println("Average temp: " + temperatureHistory.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());
    }
}
