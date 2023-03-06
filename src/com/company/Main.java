package com.company;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
	    TemperatureSensor ts = new TemperatureSensor(12,1);

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
        ts1.setTempState(80);
    }
}
