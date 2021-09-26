package light.star.study.envers.member.embedded;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class MemberProfile {

    private String phoneNumber;

    private String address;

    private String fun;

    public MemberProfile updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MemberProfile updateAddress(String address) {
        this.address = address;
        return this;
    }

    public MemberProfile updateFun(String fun) {
        this.fun = fun;
        return this;
    }
}
