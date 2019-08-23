package com.kiran.chainofresponsibility;

public class ServiceRequestHandlerOne implements ServiceRequestHandler   {

    private ServiceRequestHandler next;

    public ServiceRequestHandler getNext() {
        return next;
    }

    public void setNext(ServiceRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if(ServiceLevel.LEVEL_ONE == request.getLevel()){
            System.out.println("Request Handled at Level One :");
            request.setResponse("Request Handled at Level One :");
        } else {
            if(next !=null) {
                next.handleRequest(request);
            }else {
                throw new IllegalArgumentException("No Handler Found :: "+request.getLevel());
            }
        }

    }

}
