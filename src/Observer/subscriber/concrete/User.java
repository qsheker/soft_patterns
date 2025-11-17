package Observer.subscriber.concrete;

import Observer.subscriber.Subscriber;

public class User implements Subscriber {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
