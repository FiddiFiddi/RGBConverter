package com.example.rgbconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.rgbconverter.Contracts.RGBConverterContract;

public class RgbActivity extends AppCompatActivity implements RGBConverterContract.View, SeekBar.OnSeekBarChangeListener
{
    private TextView hexText;
    private ImageView colorBox;
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    
    private RGBConverterContract.Presenter presenter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rgb_activity);
        presenter = new Presenter(this);
        
        hexText = findViewById(R.id.hex_text);
        
        SeekBar seekRed = findViewById(R.id.seek_bar_red);
        seekRed.setOnSeekBarChangeListener(this);
        
        SeekBar seekGreen = findViewById(R.id.seek_bar_green);
        seekGreen.setOnSeekBarChangeListener(this);
        
        SeekBar seekBlue = findViewById(R.id.seek_bar_blue);
        seekBlue.setOnSeekBarChangeListener(this);
        
        colorBox = findViewById(R.id.color_box);
        
    }
    
    
    @Override
    public void setColor()
    {
        // Gets the hex value
        int color = Color.parseColor(hexText.getText().toString());
        // Parses hex value to int for presenting
        colorBox.setBackgroundColor(color);
    }

    // Presents Hex value to client
    @Override
    public void setHex(String hexText)
    {
        this.hexText.setText(hexText);
        setColor();
    }
    
    @Override
    public void calculateHex(int r, int g, int b)
    {
        //get colors.
        presenter.calculateHex(r, g, b);
    }

    // When a seek bar is used
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        switch (seekBar.getId())
        {
            case R.id.seek_bar_red:
                red = i;
                break;
            case R.id.seek_bar_green:
                green = i;
                break;
            case R.id.seek_bar_blue:
                blue = i;
                break;
        }
        calculateHex(red, green, blue);
    }
    
    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {
    
    }
    
    @Override
    public void onStopTrackingTouch(SeekBar seekBar)
    {
    
    }
}
