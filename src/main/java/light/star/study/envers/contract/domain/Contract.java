package light.star.study.envers.contract.domain;

import light.star.study.envers.common.AuditEntity;
import light.star.study.envers.draft.domain.Draft;
import light.star.study.envers.member.domain.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Audited
@AuditOverride(forClass = AuditEntity.class)
public class Contract extends AuditEntity {

    private String column1;

    private String column2;

    @OneToOne
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private Draft draft;

    @OneToOne
    @NotAudited
    private Member manager;
}
