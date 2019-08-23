package com.kiran.obeserver;

public class SubscriberOne implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("Message from Observer to SubscriberOne : "+message.getMessage());
    }
}
