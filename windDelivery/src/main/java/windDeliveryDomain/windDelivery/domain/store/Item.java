package windDeliveryDomain.windDelivery.domain.store;

import windDeliveryDomain.windDelivery.domain.order.OrderItem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private Long price;

    private String name;

    @OneToMany(mappedBy = "item")
    private List<Store> storeList = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<OrderItem> orderItemList = new ArrayList<>();

}
