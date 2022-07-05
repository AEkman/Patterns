package com.andreasekman.pattern.strategy;

public class MysqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting mysql");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected mysql");
    }
}
