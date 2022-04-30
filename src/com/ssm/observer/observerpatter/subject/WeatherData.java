package com.ssm.observer.observerpatter.subject;

import com.ssm.observer.observerpatter.observers.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<WeatherObserver> observers = new ArrayList<>();

    private double temperature;
    private double humidity;
    private double pressure;

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }
    public double getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver weatherObserver : observers){
            weatherObserver.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }



}
