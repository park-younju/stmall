package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderStatusUpdate extends AbstractEvent {

    private Long id;

    public OrderStatusUpdate(Order aggregate) {
        super(aggregate);
    }

    public OrderStatusUpdate() {
        super();
    }
}
//>>> DDD / Domain Event
