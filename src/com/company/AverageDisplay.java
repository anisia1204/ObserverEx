package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class AverageDisplay implements Observer{
    private int value;
   // private ArrayList<Integer> temperatureHistory;

    private int sensorId;
    private String location;
    private String lastTechnicalRevision;
    private double meteorologicalPrecision;
    private HashMap<Integer, ArrayList<Integer>> temperatureHistoriesForEachSensor;

    public AverageDisplay() {
        this.temperatureHistoriesForEachSensor = new HashMap<Integer, ArrayList<Integer>>();
    }

    @Override
    public void update(Subject tempSensor) {
        if(tempSensor instanceof TemperatureSensor) {
            value = ((TemperatureSensor) tempSensor).getTempState();
            sensorId = ((TemperatureSensor) tempSensor).getSensorId();
            temperatureHistoriesForEachSensor.get(sensorId).add(value);
            location = ((TemperatureSensor) tempSensor).getLocation();
            lastTechnicalRevision = ((TemperatureSensor) tempSensor).getLastTechnicalRevision();
            meteorologicalPrecision = ((TemperatureSensor) tempSensor).getMeteorologicalPrecision();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Sensor id = " + sensorId);
        System.out.println("Last technical revision = " + lastTechnicalRevision);
        System.out.println("Current temperature = " + value);
        System.out.println("Current location = " + location);
        System.out.println("Current meteorological precision = " + meteorologicalPrecision);
        System.out.println("Average temp: " + temperatureHistoriesForEachSensor.get(sensorId).stream().mapToDouble(Integer::doubleValue).average().getAsDouble());
    }

    public HashMap<Integer, ArrayList<Integer>> getTemperatureHistoriesForEachSensor() {
        return temperatureHistoriesForEachSensor;
    }

    public void setTemperatureHistoriesForEachSensor(HashMap<Integer, ArrayList<Integer>> temperatureHistoriesForEachSensor) {
        this.temperatureHistoriesForEachSensor = temperatureHistoriesForEachSensor;
    }
}
