package light.star.study.envers.basket.domain;

import light.star.study.envers.common.AuditEntity;
import light.star.study.envers.item.domain.Item;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Audited
@AuditOverride(forClass = AuditEntity.class)
public class Basket extends AuditEntity{

    private String name;

    @OneToMany
    private List<Item> items;
}
