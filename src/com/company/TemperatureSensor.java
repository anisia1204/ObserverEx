package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class TemperatureSensor implements Subject{
    private ArrayList<Observer> observers;
    private int tempState;
    private int sensorId;
    private String location;
    private String lastTechnicalRevision;
    private double meteorologicalPrecision;

    public TemperatureSensor(int tempState, int sensorId, String location, String lastTechnicalRevision, double meteorologicalPrecision) {
        this.tempState = tempState;
        observers = new ArrayList<Observer>();
        this.sensorId = sensorId;
        this.location = location;
        this.lastTechnicalRevision = lastTechnicalRevision;
        this.meteorologicalPrecision = meteorologicalPrecision;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        if (observer instanceof AverageDisplay) {
            HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
            ArrayList<Integer> temperatureHistory = new ArrayList<>();
            hm.put(sensorId, temperatureHistory);
            ((AverageDisplay) observer).setTemperatureHistoriesForEachSensor(hm);
        }
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers)
            o.update(this);
    }

    public int getTempState() {
        return tempState;
    }

    public void setTempState(int newTempState) {
        this.tempState = newTempState;
        notifyObservers();
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int newSensorId) {
        this.sensorId = newSensorId;
        notifyObservers();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
        notifyObservers();
    }

    public String getLastTechnicalRevision() {
        return lastTechnicalRevision;
    }

    public void setLastTechnicalRevision(String newTechnicalRevision) {
        this.lastTechnicalRevision = newTechnicalRevision;
        notifyObservers();
    }

    public double getMeteorologicalPrecision() {
        return meteorologicalPrecision;
    }

    public void setMeteorologicalPrecision(double newMeteorologicalPrecision) {
        this.meteorologicalPrecision = newMeteorologicalPrecision;
        notifyObservers();
    }
}
