package windDeliveryDomain.windDelivery.domain.chat;

import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ChatMember {

    @Id
    @GeneratedValue
    @Column(name = "chatmember_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatroom_id")
    private ChatRoom chatRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "chatMember")
    private List<ChatMessage> chatMessageList = new ArrayList<>();

}
