package com.example.rgbconverter.Contracts;

public interface RGBConverterContract
{
    interface View
    {
        void setColor();
        void setHex();
        void calculateHex();
    }
    
    interface Presenter
    {
        void setHex();
        void calculateHex();
    }
}
