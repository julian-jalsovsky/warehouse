package sk.jalsovsky.warehouse.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByCategory(@Param("category") String category);
}
