package food.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import food.StoreApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cooking_table")
@Data
//<<< DDD / Aggregate Root
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    private String foodId;

    private String option;

    private String status;

    public static CookingRepository repository() {
        CookingRepository cookingRepository = StoreApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }

    //<<< Clean Arch / Port Method
    public void isaccept(IsacceptCommand isacceptCommand) {
        //implement business logic here:

        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();
        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void startCook() {
        //implement business logic here:

        CoodStarted coodStarted = new CoodStarted(this);
        coodStarted.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void finishCook() {
        //implement business logic here:

        CoodFinished coodFinished = new CoodFinished(this);
        coodFinished.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        */

        /** Example 2:  finding and process
        

        repository().findById(orderPlaced.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
