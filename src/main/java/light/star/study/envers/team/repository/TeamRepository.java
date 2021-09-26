package light.star.study.envers.team.repository;

import light.star.study.envers.team.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TeamRepository extends JpaRepository<Team, Long>, RevisionRepository<Team, Long, Long> {
}
