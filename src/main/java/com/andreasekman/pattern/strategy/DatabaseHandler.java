package com.andreasekman.pattern.strategy;

public class DatabaseHandler implements Database {

    private Database database;

    public DatabaseHandler(Database database) {
        this.database = database;
    }

    public void connect() {
        database.connect();
    }

    public void disconnect() {
        database.disconnect();
    }

}
