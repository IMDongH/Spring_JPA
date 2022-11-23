package windDeliveryDomain.windDelivery.domain.users;

import windDeliveryDomain.windDelivery.domain.chat.ChatMember;
import windDeliveryDomain.windDelivery.domain.order.Order;
import windDeliveryDomain.windDelivery.domain.point.Point;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
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

}
