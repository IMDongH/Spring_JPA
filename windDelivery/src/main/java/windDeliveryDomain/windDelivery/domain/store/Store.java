package windDeliveryDomain.windDelivery.domain.store;


import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.users.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;


    @OneToMany(mappedBy = "store")
    private List<Order> order = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
}
