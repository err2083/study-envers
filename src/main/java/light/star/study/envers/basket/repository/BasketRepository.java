package light.star.study.envers.basket.repository;

import light.star.study.envers.basket.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BasketRepository extends JpaRepository<Basket, Long>, RevisionRepository<Basket, Long, Long> {
}
