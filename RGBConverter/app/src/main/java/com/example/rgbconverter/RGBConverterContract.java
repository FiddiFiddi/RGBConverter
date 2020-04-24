package com.example.rgbconverter;

interface RGBConverterContract
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
