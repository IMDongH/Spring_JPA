package windDeliveryDomain.windDelivery.domain.order;

import windDeliveryDomain.windDelivery.domain.chat.ChatRoom;
import windDeliveryDomain.windDelivery.domain.store.Store;
import windDeliveryDomain.windDelivery.domain.users.Destination;
import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;


    private LocalDateTime orderDateTime;

    private OrderStatus orderStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_id")
    private Destination destination;

    @OneToMany(mappedBy = "order")
    private List<ChatRoom> chatRoomList = new ArrayList<>();

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;


}