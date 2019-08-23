package com.kiran.strategy;

public class OracleDataSource implements DataSourceStrategy {

    @Override
    public void connectTo(Database database) {
        System.out.println("Connect to Oracle Database :");
    }
}
