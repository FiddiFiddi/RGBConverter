package com.example.rgbconverter.Model;

import com.example.rgbconverter.Interface.IObservable;
import com.example.rgbconverter.Interface.IObserver;

import java.util.ArrayList;
import java.util.List;

public class RGBConverter implements IObservable
{
    
    private List<IObserver> obServers = new ArrayList<>();
    private String hexValue = "";
    
    public void CalculateHex(int red, int green, int blue)
    {
        hexValue = String.format("#%02x%02x%02x", red, green, blue);
        notifyObservers();
    }
    
    @Override
    public void addObserver(IObserver iObserver)
    {
        obServers.add(iObserver);
    }
    
    @Override
    public void notifyObservers()
    {
        for (IObserver observer : obServers)
        {
            observer.onChange(hexValue);
        }
    }
}
