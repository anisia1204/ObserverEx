package com.company;

import java.util.ArrayList;

public class TemperatureSensor implements Subject{
    private ArrayList<Observer> observers;
    private int tempState;
    private int sensorId;
    private String location;
    private String lastTechnicalRevision;
    private double meteorologicalPrecision;

    public TemperatureSensor(int tempState) {
        this.tempState = tempState;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers)
            o.update((tempState));
    }

    public int getTempState() {
        return tempState;
    }

    public void setTempState(int newTempState) {
        this.tempState = newTempState;
        notifyObservers();
    }


}
