package windDeliveryDomain.windDelivery.domain.point;

import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;

@Entity
public class Point {

    @Id @GeneratedValue
    @Column(name = "point_id")
    private Long id;

    private Long amount;

    @Enumerated(value = EnumType.STRING)
    private PointStatus pointStatus;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
