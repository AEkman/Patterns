package com.andreasekman.pattern.observer;

public interface Observer {
    public void update(int pressure, int temperature, int humidity);
}
