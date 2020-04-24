package com.example.rgbconverter.Model;

import com.example.rgbconverter.Interface.IObservable;
import com.example.rgbconverter.Interface.IObserver;

import java.util.ArrayList;
import java.util.List;

public class RgbConverter implements IObservable {

    List<IObserver> obServers = new ArrayList<>();
    String hexValue = "";

    void CalculateHex(int Red, int Green, int Blue){
        // Convert Color TO COME..

        notifyObservers();
    }

    @Override
    public void addObserver(IObserver iObserver) {
        obServers.add(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: obServers)
        {
            observer.onChange(hexValue);
        }
    }
}
