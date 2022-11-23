package windDeliveryDomain.windDelivery.domain.users;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Building {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Address address;

}
