package com.andreasekman.pattern.strategy;

public class Main {

    public static void main(String[] args) {
        DatabaseHandler databaseHandler = new DatabaseHandler(new MysqlDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();

        DatabaseHandler databaseHandler2 = new DatabaseHandler(new OracleDatabase());
        databaseHandler2.connect();
        databaseHandler2.disconnect();
    }
}
