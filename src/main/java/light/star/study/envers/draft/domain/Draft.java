package light.star.study.envers.draft.domain;

import light.star.study.envers.common.AuditEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Draft extends AuditEntity {

    private String column1;

    private String column2;
}
