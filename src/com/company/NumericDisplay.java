package com.company;

public class NumericDisplay implements Observer {
    private int value;
    private String location;
    private double meteorologicalPrecision;

    public NumericDisplay() {
    }

    @Override
    public void update(Subject tempSensor) {
        if(tempSensor instanceof TemperatureSensor) {
            value = ((TemperatureSensor) tempSensor).getTempState();
            location = ((TemperatureSensor) tempSensor).getLocation();
            meteorologicalPrecision = ((TemperatureSensor) tempSensor).getMeteorologicalPrecision();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Current temperature = " + value);
        System.out.println("Current location = " + location);
        System.out.println("Current meteorological precision = " + meteorologicalPrecision);
    }
}
