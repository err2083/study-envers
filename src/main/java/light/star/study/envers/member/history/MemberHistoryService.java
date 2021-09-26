package light.star.study.envers.member.history;

import light.star.study.envers.member.domain.Member;
import light.star.study.envers.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.history.Revision;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberHistoryService {

    @PersistenceContext
    private final EntityManager entityManager;

    private final MemberRepository memberRepository;

    public List<Member> findById(Long id) {
        Page<Revision<Long, Member>> revisions = memberRepository.findRevisions(id, PageRequest.of(0 ,20));
        return revisions.getContent().stream().map(Revision::getEntity).collect(Collectors.toList());
    }

//    public List<Member> findById(Long id) {
//        return getAuditReader().createQuery()
//                .forRevisionsOfEntity(Member.class, true, true)
//                .add(AuditEntity.id().eq(id))
//                .addOrder(AuditEntity.revisionNumber().desc())
//                .getResultList();
//    }

    public Member findRev(Long id) {
        return (Member) getAuditReader().createQuery()
                .forEntitiesAtRevision(Member.class, id)
                .getSingleResult();
    }

    private AuditReader getAuditReader() {
        return AuditReaderFactory.get(entityManager);
    }
}
