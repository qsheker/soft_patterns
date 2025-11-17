package Observer.broker.concrete;

import Observer.broker.MessageBroker;
import Observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class RabbitMq implements MessageBroker {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void publish(String message){
        for(var sub: subscribers){
            sub.receive(message);
        }
    }
}
