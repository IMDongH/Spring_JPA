package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.DataJpaApplication;
import study.datajpa.repository.MemberJpaRepository;
import study.datajpa.entity.Member;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DataJpaApplication.class)
@Transactional
class MemberJpaRepositoryTest {

    @Autowired
    MemberJpaRepository memberJpaRepository;

    @Test
    public void testMember() throws Exception {
        //given
        Member member = new Member("member1");
        //when
        Member saveMember = memberJpaRepository.save(member);
        //then
        Member findMember = memberJpaRepository.find(saveMember.getId());
        assertThat(findMember.getId()).isEqualTo(member.getId());
        assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        assertThat(findMember).isEqualTo(member);
    }
}