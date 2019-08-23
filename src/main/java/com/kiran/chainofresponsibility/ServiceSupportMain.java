package com.kiran.chainofresponsibility;

public class ServiceSupportMain {
    public static void main(String[] args) {
        ServiceRequest request = new ServiceRequest();
        request.setLevel(ServiceLevel.LEVEL_TWO);
        ServiceSupport support = new ServiceSupport();
        ServiceRequestHandlerOne handler = new ServiceRequestHandlerOne();
        ServiceRequestHandler secHandler = new ServiceRequestHandlerTwo();
        handler.setNext(secHandler);
        support.setRequestHandler(handler);
        handler.handleRequest(request);
    }
}
