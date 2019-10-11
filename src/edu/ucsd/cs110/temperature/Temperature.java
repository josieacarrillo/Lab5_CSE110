package edu.ucsd.cs110.temperature;

public class Temperature(float v) {
    {
        float value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}
