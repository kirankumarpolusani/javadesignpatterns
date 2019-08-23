package com.kiran.strategy;

public class MySqlDataSource implements DataSourceStrategy {
    @Override
    public void connectTo(Database database) {
        System.out.println("Connected to MySql Database ::");
    }
}
