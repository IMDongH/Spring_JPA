package windDeliveryDomain.windDelivery.domain.order;

import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    private Order order;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(value = EnumType.STRING)
    private DeliveryStatus deliveryStatus;

}
