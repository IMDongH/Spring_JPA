package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

        @Autowired MemberRepository memberRepository;
        @Autowired MemberService memberService;

        @Test
        public void 회원가입() throws Exception{
            //given
            Member member = new Member();
            member.setName("LIM");

            //when
            Long saveId = memberService.join(member);

            //then
            assertEquals(member,memberRepository.findOne(saveId));
        }

        @Test
        public void 중복_회원_예외() throws Exception {
            //given
            Member member1 = new Member();
            member1.setName("lim");

            Member member2 = new Member();
            member2.setName("lim");

            //when
            memberService.join(member1);
            memberService.join(member2); //예외 발생해야함.


            //then
//            fail("예외가 발생해야 한다.");
        }

}