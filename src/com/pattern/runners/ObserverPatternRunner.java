package com.pattern.runners;

import com.pattern.core.observer.BinaryObserver;
import com.pattern.core.observer.DefaultObserver;
import com.pattern.core.observer.HexaObserver;
import com.pattern.core.observer.OctalObserver;
import com.pattern.core.observer.Subject;

public class ObserverPatternRunner {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new DefaultObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // System.out.println("First state change: 15");
        subject.setState(15);
        // System.out.println("Second state change: 10");
        subject.setState(10);

    }

}
