package com.example.rgbconverter.Contracts;

public interface RGBConverterContract
{
    interface View
    {
        void setColor();
        void setHex(String hexText);
        void calculateHex(int r, int g, int b);
    }
    
    interface Presenter
    {
        void calculateHex(int r, int g, int b);
    }
}
