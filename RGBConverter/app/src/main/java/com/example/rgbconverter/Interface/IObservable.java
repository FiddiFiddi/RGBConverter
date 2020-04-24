package com.example.rgbconverter.Interface;

public interface IObservable {

    void addObserver(IObserver iObserver);
    void notifyObservers();
}
