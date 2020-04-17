package co.za.codeboss.orders.messaging;

import co.za.codeboss.messages.CreateOrder;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Service;

@Service
public class OrderSender {

    private Source source;

    public OrderSender(Source source ) {
        this.source = source;
    }

    public boolean send(CreateOrder command) {
        return this.source.output().send(MessageBuilder.withPayload(command).build());
    }
}
