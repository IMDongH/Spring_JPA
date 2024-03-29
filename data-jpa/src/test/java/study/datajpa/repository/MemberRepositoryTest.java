package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.DataJpaApplication;
import study.datajpa.entity.Member;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DataJpaApplication.class)
@Transactional
@Rollback(value = false)
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testMember() throws Exception {
        //given
        Member member = new Member("member1");
        //when
        Member saveMember = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(saveMember.getId()).orElse(null);
        assertThat(findMember.getId()).isEqualTo(member.getId());
        assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        assertThat(findMember).isEqualTo(member);
    }

    @Test
    public void basicCRUD() throws Exception{
        //given
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");
        //when
        Member findMember1 = memberRepository.save(member1);
        Member findMember2 = memberRepository.save(member2);

        //then
        assertThat(member1).isEqualTo(findMember1);
        assertThat(member2).isEqualTo(findMember2);
    }
}