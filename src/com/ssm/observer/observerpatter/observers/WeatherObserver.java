package com.ssm.observer.observerpatter.observers;

public interface WeatherObserver {

    /**
     * Subject notifies observer by calling this method
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(double temperature, double humidity, double pressure);
}
