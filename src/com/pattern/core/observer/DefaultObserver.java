package com.pattern.core.observer;

public class DefaultObserver extends Observer {

    public DefaultObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Default String: " + (subject.getState()));
    }

}
