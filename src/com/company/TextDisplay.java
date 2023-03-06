package com.company;

public class TextDisplay implements Observer{
    private int value;
    private String location;

    public TextDisplay() {
    }

    @Override
    public void update(Subject tempSensor) {
        if(tempSensor instanceof TemperatureSensor) {
            value = ((TemperatureSensor) tempSensor).getTempState();
            location = ((TemperatureSensor) tempSensor).getLocation();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Current location " + this.location);
        if(this.value < 20)
            System.out.println("cold");
        else
            System.out.println("warm");
    }
}
