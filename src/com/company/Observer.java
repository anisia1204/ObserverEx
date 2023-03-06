package com.company;

public interface Observer {
    public Subject subject = new TemperatureSensor(0, 0, "", "", 0.0);
    public void update(Subject subject);
    public void display();
}
