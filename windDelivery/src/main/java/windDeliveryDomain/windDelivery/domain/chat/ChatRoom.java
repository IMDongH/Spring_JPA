package windDeliveryDomain.windDelivery.domain.chat;

import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ChatRoom {

    @Id @GeneratedValue
    @Column(name = "chatroom_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToMany(mappedBy = "chatRoom")
    private List<ChatMember> chatMemberList = new ArrayList<>();

    @Column(updatable = false)
    private LocalDateTime createDate;
}
