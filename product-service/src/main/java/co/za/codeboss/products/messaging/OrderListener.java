package co.za.codeboss.products.messaging;

import co.za.codeboss.messages.OrderCreated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

@Slf4j
@EnableBinding(Processor.class)
public class OrderListener {

    @StreamListener(Processor.INPUT)
    public void receiveOrder(OrderCreated event) { // or Message<OrderCreated> message
        log.info("\n******************\nReceiveOrder\n******************\n");
        log.info("Order created event: {}", event);
    }

}


