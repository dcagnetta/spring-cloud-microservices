package co.za.codeboss.messages.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Order {
    private Long id;
    private OrderStatus status;
    private float price;
    private List<Long> products;
}
