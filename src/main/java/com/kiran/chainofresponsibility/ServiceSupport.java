package com.kiran.chainofresponsibility;

public class ServiceSupport implements ServiceRequestHandler {
    private ServiceRequestHandler requestHandler;

    public ServiceRequestHandler getRequestHandler() {
        return requestHandler;
    }

    public void setRequestHandler(ServiceRequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        requestHandler.handleRequest(request);
    }
}
