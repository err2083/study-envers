package light.star.study.envers.draft.repository;

import light.star.study.envers.draft.domain.Draft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DraftRepository extends JpaRepository<Draft, Long>, RevisionRepository<Draft, Long, Long> {
}
