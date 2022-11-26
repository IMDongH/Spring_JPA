package windDeliveryDomain.windDelivery.domain.chat;

import windDeliveryDomain.windDelivery.domain.users.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ChatMessage {

    @Id @GeneratedValue
    @Column(name = "chatmessage_id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatroom_id")
    private ChatRoom chatRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String message;

    @Column(updatable = false)
    private LocalDateTime createDate;

}
