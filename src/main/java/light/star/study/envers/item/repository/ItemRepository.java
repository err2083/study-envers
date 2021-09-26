package light.star.study.envers.item.repository;

import light.star.study.envers.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long>, RevisionRepository<Item, Long, Long> {
}
