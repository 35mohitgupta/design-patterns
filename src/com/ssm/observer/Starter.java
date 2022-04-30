package com.ssm.observer;

import com.ssm.observer.observerpatter.observers.CurrentConditionsDisplay;
import com.ssm.observer.observerpatter.observers.StatisticsDisplay;
import com.ssm.observer.observerpatter.subject.Subject;
import com.ssm.observer.observerpatter.subject.WeatherData;

import java.util.concurrent.*;

public class Starter {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.measurementChanged(11,12,44);
        weatherData.measurementChanged(21,32,14);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.measurementChanged(41,22,24);

    }

}
