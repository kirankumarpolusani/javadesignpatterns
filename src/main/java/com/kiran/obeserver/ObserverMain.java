package com.kiran.obeserver;

public class ObserverMain {
    public static void main(String[] args) {
        Observer o1 = new SubscriberOne();
        Observer o2 = new SubscriberTwo();

        Subject subject = new SubjectImpl();
        subject.attach(o1);
        subject.attach(o2);

        Message msg = new Message();
        msg.setMessage("Hello!!!!!");
        subject.notifyObservers(msg);

    }
}
