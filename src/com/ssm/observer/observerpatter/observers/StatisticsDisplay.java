package com.ssm.observer.observerpatter.observers;

import com.ssm.observer.DisplayElement;
import com.ssm.observer.observerpatter.subject.Subject;
import com.ssm.observer.observerpatter.subject.WeatherData;

public class StatisticsDisplay implements WeatherObserver, DisplayElement {

    private double minTemperature;
    private double maxTemperature;
    private double avgTemperature;
    private double minHumidity;
    private double maxHumidity;
    private double avgHumidity;
    private double minPressure;
    private double maxPressure;
    private double avgPressure;
    private int count = 0;

    private Subject weatherSubject;

    public StatisticsDisplay(Subject weatherSubject){
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        count++;
        updateTemperatureStats(temperature);
        updateHumidityStats(humidity);
        updatePressureStats(pressure);
        display();
    }

    private void updatePressureStats(double pressure) {
        minPressure = Math.min(minPressure, pressure);
        maxPressure = Math.max(maxPressure, pressure);
        avgPressure = (avgPressure * (count-1) + pressure)/count;
    }

    private void updateHumidityStats(double humidity) {
        minHumidity = Math.min(minHumidity, humidity);
        maxHumidity = Math.max(maxHumidity, humidity);
        avgHumidity = (avgHumidity * (count-1) + humidity)/count;
    }

    private void updateTemperatureStats(double temperature) {
        minTemperature = Math.min(minTemperature, temperature);
        maxTemperature = Math.max(maxTemperature, temperature);
        avgTemperature = (avgTemperature * (count-1) + temperature)/count;
    }

    @Override
    public void display() {
        System.out.println("=========== Statistics Display ===========");
        System.out.println("----------- Temperature Stats ------------");
        displayTemperatureStats();
        System.out.println("----------- Humidity Stats ------------");
        displayHumidityStats();
        System.out.println("----------- Pressure Stats ------------");
        displayPressureStats();
    }

    private void displayPressureStats() {
        System.out.println("Min Pressure: "+ minPressure + " Max Pressure: "+maxPressure+
                "Avg Pressure: "+avgPressure);
    }

    private void displayHumidityStats() {
        System.out.println("Min Humidity: "+ minHumidity + " Max Humidity: "+maxHumidity+
                "Avg Humidity: "+avgHumidity);
    }

    private void displayTemperatureStats() {
        System.out.println("Min Temperature: "+ minTemperature + " Max Temperature: "+maxTemperature+
                "Avg Temperature: "+avgTemperature);
    }
}
