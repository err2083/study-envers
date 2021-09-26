package light.star.study.envers.common;

import lombok.Setter;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@RevisionEntity(CustomRevisionEntityListener.class)
@Table(name = "revinfo")
public class CustomRevisionEntity implements Serializable {

    @Id
    @GeneratedValue
    @RevisionNumber
    private Long id;

    @RevisionTimestamp
    private Long revtstmp;

    @Setter
    private String customColumn;
}
