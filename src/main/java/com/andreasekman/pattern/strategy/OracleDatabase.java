package com.andreasekman.pattern.strategy;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected oracle");
    }
}
