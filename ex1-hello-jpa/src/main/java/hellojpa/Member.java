package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity //JPA를 사용하는 애라고 인식함
//@Table(name = "MBR", )
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    //column 이름은 다른 거 사용할 때 , 변경을 반영시키지 않을 때 updatable = false
    // nullable = false 는 not null 제약 조건
    // unique 제약조건 - 잘안쓴다 (이름이 랜덤하게 들어가기 때문) 그래서 @Table(uniqueConstaraints = 이름) 을 사용한다 보통
    // length 지정
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Member(){

    }

}
