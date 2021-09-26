package light.star.study.envers.item.domain;

import light.star.study.envers.common.AuditEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Audited
@AuditOverride(forClass = AuditEntity.class)
public class Item extends AuditEntity {

    private String name;
}
