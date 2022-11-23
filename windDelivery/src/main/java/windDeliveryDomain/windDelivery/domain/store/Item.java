package windDeliveryDomain.windDelivery.domain.store;

import windDeliveryDomain.windDelivery.domain.order.OrderItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private Long price;

    private String name;

    @OneToMany(mappedBy = "item")
    private List<Store> storeList = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItemList = new ArrayList<>();

}
