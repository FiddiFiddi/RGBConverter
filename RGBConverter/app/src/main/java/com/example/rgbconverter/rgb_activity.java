package com.example.rgbconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rgbconverter.Contracts.RGBConverterContract;

public class rgb_activity extends AppCompatActivity implements RGBConverterContract.View
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rgb_activity);
        Presenter pres = new Presenter(this);
        
        
    }
    
    @Override
    public void setColor()
    {
    
    }
    
    @Override
    public void setHex()
    {
    
    }
    
    @Override
    public void calculateHex()
    {
    
    }
}
