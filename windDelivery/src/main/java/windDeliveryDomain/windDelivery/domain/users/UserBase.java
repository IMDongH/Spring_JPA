package windDeliveryDomain.windDelivery.domain.users;

import javax.persistence.*;

@Entity
public class UserBase extends BaseTimeEntity{

    @Id @GeneratedValue
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @Enumerated(EnumType.STRING)
    protected UserLevel userLevel;

}
