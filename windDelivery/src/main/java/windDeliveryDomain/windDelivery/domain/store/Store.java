package windDeliveryDomain.windDelivery.domain.store;


import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.users.Address;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Address address;


    @OneToOne(fetch = FetchType.LAZY)
    private Order order;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
}
