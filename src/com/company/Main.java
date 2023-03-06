package com.company;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
	    TemperatureSensor ts = new TemperatureSensor(12);

        NumericDisplay nd = new NumericDisplay();
        TextDisplay td = new TextDisplay();
        AverageDisplay ad = new AverageDisplay();

        ts.attach(nd);
        ts.attach(td);
     //   ts.attach(ad);

        ts.setTempState(24);
        ts.setTempState(11);
        ts.attach(ad);
        ts.setTempState(10);
        ts.setTempState(1);
    }
}
