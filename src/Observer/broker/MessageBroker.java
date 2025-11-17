package Observer.broker;

import Observer.subscriber.Subscriber;

public interface MessageBroker {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void publish(String message);
}
