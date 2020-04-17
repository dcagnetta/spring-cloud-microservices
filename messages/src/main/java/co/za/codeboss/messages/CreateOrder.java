package co.za.codeboss.messages;

import co.za.codeboss.messages.domain.model.OrderStatus;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrder {
    private Long orderId;
    private OrderStatus status = OrderStatus.NEW;
    private float price;
    private List<Long> products;
}

