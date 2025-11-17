package Observer.producer;

import Observer.broker.concrete.RabbitMq;

public class Producer {
    private RabbitMq rabbitMq;

    public Producer(RabbitMq rabbitMq) {
        this.rabbitMq = rabbitMq;
    }

    public void publish(String message){
        rabbitMq.publish(message);
    }
}
