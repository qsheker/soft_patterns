package Observer;

import Observer.broker.concrete.RabbitMq;
import Observer.producer.Producer;
import Observer.subscriber.Subscriber;
import Observer.subscriber.concrete.User;

public class Runner {
    public static void main(String[] args) {
        RabbitMq rabbitMq = new RabbitMq();
        Subscriber user1 = new User("aldik");
        Subscriber user2 = new User("qsheker");

        rabbitMq.subscribe(user1);
        rabbitMq.subscribe(user2);

        Producer producer = new Producer(rabbitMq);

        producer.publish("Do some task");
        producer.publish("Brooo do some task");
    }
}
