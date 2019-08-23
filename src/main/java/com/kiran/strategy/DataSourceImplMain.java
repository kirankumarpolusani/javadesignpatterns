package com.kiran.strategy;

public class DataSourceImplMain {
    public static void main(String[] args) {
        DataSourceStrategy strategy = new OracleDataSource();
        DataSourceImpl d = new DataSourceImpl();
        d.setSourceStrategy(strategy);
        d.connectTo(new Database());

    }
}
