package com.kiran.strategy;

public interface DataSourceStrategy {
    public void connectTo(Database database);
}
