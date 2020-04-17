package co.za.codeboss.orders.controller;

import co.za.codeboss.messages.CreateOrder;
import co.za.codeboss.orders.messaging.OrderSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    private OrderSender sender;

    public OrderController(OrderSender sender) {
        this.sender = sender;
    }

    @PostMapping
    public String process(@RequestBody CreateOrder command)  {
        log.info("Order request: {}", command);
        boolean isSent = sender.send(command);
        return "success: " + isSent;
    }

}
