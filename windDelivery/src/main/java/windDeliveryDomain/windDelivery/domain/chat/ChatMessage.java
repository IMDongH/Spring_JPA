package windDeliveryDomain.windDelivery.domain.chat;

import javax.persistence.*;

@Entity
public class ChatMessage {

    @Id @GeneratedValue
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatRoom_id")
    private ChatRoom chatRoom;
}
