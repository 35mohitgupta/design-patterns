package com.ssm.observer.observerpatter.observers;

import com.ssm.observer.DisplayElement;
import com.ssm.observer.observerpatter.subject.Subject;

public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;

    private Subject weatherSubject;

    public CurrentConditionsDisplay(Subject weatherSubject){
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("=========== Current Display ===========");
        System.out.println("Current temperature : "+ temperature);
        System.out.println("Current humidity : "+ humidity);
        System.out.println("Current pressure : "+ pressure);
    }
}
