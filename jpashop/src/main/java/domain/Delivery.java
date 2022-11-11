package domain;


import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Delivery extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

//    private String city;
//    private String street;
//    private String zipcode;
    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private DeliveryStatus status;


}
