package com.andreasekman.pattern.observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        new WeatherObserver(weatherStation);

        weatherStation.setHumidity(100);
        weatherStation.setTemperature(150);
        weatherStation.setPressure(50);

    }
}
