package windDeliveryDomain.windDelivery.domain.order;

import windDeliveryDomain.windDelivery.domain.chat.ChatRoom;
import windDeliveryDomain.windDelivery.domain.store.Store;
import windDeliveryDomain.windDelivery.domain.users.Address;
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
    private User user; //주문자

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @Embedded
    private Address address; //목적지 주소

    @OneToMany(mappedBy = "order")
    private List<ChatRoom> chatRoomList = new ArrayList<>();

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store; //주문하는 가게


}