package com.kiran.strategy;

public class DataSourceImpl implements DataSourceStrategy{
    private DataSourceStrategy sourceStrategy;

    public DataSourceStrategy getSourceStrategy() {
        return sourceStrategy;
    }

    public void setSourceStrategy(DataSourceStrategy sourceStrategy) {
        this.sourceStrategy = sourceStrategy;
    }

    @Override
    public void connectTo(Database database) {
        sourceStrategy.connectTo(database);
    }
}
