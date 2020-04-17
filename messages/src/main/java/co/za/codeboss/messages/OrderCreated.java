package co.za.codeboss.messages;

import lombok.Data;

import java.util.List;

@Data
public class OrderCreated {
    private Long orderId;
    private List<Long> products;
}
