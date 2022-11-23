package windDeliveryDomain.windDelivery.domain.order;

import windDeliveryDomain.windDelivery.domain.store.Item;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    private Long id;

    private Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;


}
