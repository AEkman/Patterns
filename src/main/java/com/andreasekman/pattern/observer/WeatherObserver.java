package com.andreasekman.pattern.observer;

public class WeatherObserver implements Observer {

    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subjects;

    public WeatherObserver(Subject subject) {
        this.subjects = subject;
        this.subjects.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + pressure + " Temperature: " + temperature + " Humidity: " + humidity);
    }
}
