package com.andreasekman.pattern.strategy;

public interface Database {
    void connect();

    void disconnect();
}
