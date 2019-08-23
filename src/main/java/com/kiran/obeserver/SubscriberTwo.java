package com.kiran.obeserver;

public class SubscriberTwo implements Observer   {

    @Override
    public void update(Message message) {
        System.out.println("Message from Observer to SubscriberTwo : "+message.getMessage());
    }
}
