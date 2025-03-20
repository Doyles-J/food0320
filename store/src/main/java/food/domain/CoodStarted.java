package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CoodStarted extends AbstractEvent {

    private Long id;
    private String orderId;

    public CoodStarted(Cooking aggregate) {
        super(aggregate);
    }

    public CoodStarted() {
        super();
    }
}
//>>> DDD / Domain Event
