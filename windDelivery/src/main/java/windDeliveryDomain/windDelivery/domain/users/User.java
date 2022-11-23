package windDeliveryDomain.windDelivery.domain.users;

import lombok.Getter;
import windDeliveryDomain.windDelivery.domain.chat.ChatMember;
import windDeliveryDomain.windDelivery.domain.chat.ChatMessage;
import windDeliveryDomain.windDelivery.domain.order.Delivery;
import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.point.Point;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User extends UserBase {

    private String name;

    private String phone;

    private Long point;


    @OneToMany(mappedBy = "user")
    private List<Point> pointList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Order> orderList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ChatMember> chatMemberList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ChatMessage> chatMessageList = new ArrayList<>();

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Delivery delivery;

}
