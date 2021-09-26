package light.star.study.envers.team.domain;

import light.star.study.envers.common.AuditEntity;
import light.star.study.envers.member.domain.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditJoinTable;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Audited
@AuditOverride(forClass = AuditEntity.class)
public class Team extends AuditEntity {

    private String name;

    @OneToMany
    @JoinColumn(name = "team_id")
    @AuditJoinTable
    private List<Member> members;
}
