package windDeliveryDomain.windDelivery.domain.users;

import windDeliveryDomain.windDelivery.domain.order.Order;

import javax.persistence.*;

@Entity
public class Building {

    @Id @GeneratedValue
    @Column(name = "building_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;
}
