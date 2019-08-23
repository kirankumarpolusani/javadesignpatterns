package com.kiran.chainofresponsibility;

public class ServiceRequest {

    private String name;
    private ServiceLevel level;
    private String response;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceLevel getLevel() {
        return level;
    }

    public void setLevel(ServiceLevel level) {
        this.level = level;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
