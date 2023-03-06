package com.company;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose an option: \n" +
                "1 - Create a new temperature sensor. Input sensor data and initial temperature value.\n" +
                "2 - Create a new display (text, numeric or average)\n" +
                "3 - Attach an existing display to one of the existing temperature sensors. A sensor will have multiple displays attached. A display can be attached to multiple sensors.\n" +
                "4 - Detach a display from a sensor\n" +
                "5 - Set a new temperature value to one of the sensors. All the attached displays must update.\n" );
        int opt = keyboard.nextInt();
        ArrayList<Observer> displays = new ArrayList<>();
        switch(opt) {
            case 1: {
                System.out.println("Insert sensor id: ");
                int sensorid = keyboard.nextInt();
                System.out.println("Insert current temperature:");
                int temperature = keyboard.nextInt();
                System.out.println("Insert sensor location:");
                String location = keyboard.nextLine();
                System.out.println("Insert last technical revision:");
                String lastTechnicalRevision = keyboard.nextLine();
                System.out.println("Insert meteorological precision:");
                double meteorologicalPrecision = keyboard.nextDouble();
                TemperatureSensor ts = new TemperatureSensor(temperature, sensorid, location, lastTechnicalRevision, meteorologicalPrecision);
            }
            case 2: {
                System.out.println("Which display do you want to create? \n" +
                        "1 - Numeric Display" +
                        "2 - Text Display" +
                        "3 - Average Display");
                int opt1 = keyboard.nextInt();
                switch(opt1) {
                    case 1: {
                        NumericDisplay nd = new NumericDisplay();
                        displays.add(nd);
                        System.out.println("Numeric Display created!");
                    }
                    case 2: {
                        TextDisplay td = new TextDisplay();
                        displays.add(td);
                        System.out.println("Text Display created");
                    }
                    case 3:{
                        AverageDisplay ad = new AverageDisplay();
                        displays.add(ad);
                        System.out.println("Average Display created");
                    }
                }
            }
            case 3: {
              //  for(Observer o : TemperatureSensor.get)
            }
        }

	    /*TemperatureSensor ts = new TemperatureSensor(12,1);

        NumericDisplay nd = new NumericDisplay();
        TextDisplay td = new TextDisplay();
        AverageDisplay ad = new AverageDisplay();

        ts.attach(nd);
        ts.attach(td);
     //   ts.attach(ad);

        ts.setTempState(10);
        ts.setTempState(20);
        ts.attach(ad);
        ts.setTempState(30);
        ts.setTempState(40);

        TemperatureSensor ts1 = new TemperatureSensor(30, 7);

        ts1.attach(ad);
        ts1.setTempState(20);
        ts1.setTempState(80);*/
    }
}
