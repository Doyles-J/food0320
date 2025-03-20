package food.domain;

import food.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "cookings", path = "cookings")
public interface CookingRepository
    extends PagingAndSortingRepository<Cooking, Long> {}
