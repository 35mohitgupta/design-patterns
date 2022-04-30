package com.ssm.observer.observerpatter.subject;

import com.ssm.observer.observerpatter.observers.WeatherObserver;

public interface Subject {

    void registerObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObserver();

}
