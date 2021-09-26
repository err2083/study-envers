package light.star.study.envers.member.repository;

import light.star.study.envers.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long>, RevisionRepository<Member, Long, Long> {
}
