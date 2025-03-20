package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CoodFinished extends AbstractEvent {

    private Long id;

    public CoodFinished(Cooking aggregate) {
        super(aggregate);
    }

    public CoodFinished() {
        super();
    }
}
//>>> DDD / Domain Event
