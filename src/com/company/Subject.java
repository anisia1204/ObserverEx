package com.company;

public interface Subject {
    public void attach(Observer observer);
    public void dettach(Observer observer);
    public void notifyObservers();
}
