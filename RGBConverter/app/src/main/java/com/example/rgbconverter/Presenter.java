package com.example.rgbconverter;

import com.example.rgbconverter.Contracts.RGBConverterContract;
import com.example.rgbconverter.Interface.IObserver;

public class Presenter implements RGBConverterContract.Presenter, IObserver
{
    RGBConverterContract.View view;
    Presenter(RGBConverterContract.View view){
        this.view = view;
    }

    @Override
    public void setHex()
    {
    
    }
    
    @Override
    public void calculateHex()
    {
    
    }

    @Override
    public void onChange(String hexValue) {
        // view.setHex()
    }
}
