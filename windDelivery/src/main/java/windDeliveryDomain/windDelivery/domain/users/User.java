package windDeliveryDomain.windDelivery.domain.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import windDeliveryDomain.windDelivery.domain.chat.ChatMember;
import windDeliveryDomain.windDelivery.domain.chat.ChatMessage;
import windDeliveryDomain.windDelivery.domain.order.Delivery;
import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.point.Point;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends UserBase {

    private String name;

    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ChatMember> chatMemberList = new ArrayList<>();

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Delivery delivery;


    private Long totalAmount; //현재 point

}
