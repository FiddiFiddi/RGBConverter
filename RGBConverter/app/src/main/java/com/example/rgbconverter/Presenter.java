package com.example.rgbconverter;

import com.example.rgbconverter.Contracts.RGBConverterContract;
import com.example.rgbconverter.Interface.IObserver;
import com.example.rgbconverter.Model.RGBConverter;

public class Presenter implements RGBConverterContract.Presenter, IObserver
{
    private RGBConverterContract.View view;
    private RGBConverter rgbConverter;
    
    Presenter(RGBConverterContract.View view)
    {
        this.view = view;
        rgbConverter = new RGBConverter();
        rgbConverter.addObserver(this);
    }

    @Override
    public void calculateHex(int r, int g, int b)
    {
        rgbConverter.CalculateHex(r,g,b);
    }
    
    @Override
    public void onChange(String hexValue)
    {
        view.setHex(hexValue);
        
    }
}
