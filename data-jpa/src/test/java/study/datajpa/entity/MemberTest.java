package study.datajpa.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void testEntity() throws Exception{
        //given
        Team teamA = new Team("teamA");
        Team teamB = new Team("teamB");
        em.persist(teamA);
        em.persist(teamB);
         
        Member member1 = new Member(10,"member1",teamA);
        Member member2 = new Member(10,"member2",teamA);
        Member member3 = new Member(10,"member3",teamB);
        Member member4 = new Member(10,"member4",teamB);
        em.persist(member1);
        em.persist(member2);
        em.persist(member3);
        em.persist(member4);
        
        //초기화
        em.flush();
        em.clear();
        
        //when
        List<Member> memberList = em.createQuery("select m from Member m ", Member.class)
                .getResultList();
        for (Member member : memberList) {
            System.out.println("member = " + member);
            System.out.println("member.getTeam() = " + member.getTeam());
        }
        //then
    }

}