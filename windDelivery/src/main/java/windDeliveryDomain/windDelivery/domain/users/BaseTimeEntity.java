package windDeliveryDomain.windDelivery.domain.users;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class BaseTimeEntity {

    @CreatedDate //생성시간
    @Column(updatable = false)
    private LocalDateTime createDate;

    @LastModifiedDate //변경시간
    private LocalDateTime modifiedDate;
}
