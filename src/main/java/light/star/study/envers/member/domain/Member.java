package light.star.study.envers.member.domain;

import light.star.study.envers.common.AuditEntity;
import light.star.study.envers.member.embedded.MemberProfile;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;
import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.Audited;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Audited
@AuditOverride(forClass = AuditEntity.class)
public class Member extends AuditEntity {

    private String name;

    @Embedded
    @Delegate
    private MemberProfile profile = new MemberProfile();

    public Member(String name, String phoneNumber, String address, String fun) {
        super();
        this.name = name;
        this.profile.updatePhoneNumber(phoneNumber)
                .updateAddress(address)
                .updateFun(fun);
    }
}
