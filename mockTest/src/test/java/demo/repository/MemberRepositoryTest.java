package demo.repository;

import demo.entity.Member;
import demo.service.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


    @BeforeEach
    void setup() {
        Member member = Member.builder()
                .name("유저1")
                .age(20)
                .build();

        memberRepository.persist(member);


        Member member2 = Member.builder()
                .name("유저2")
                .age(30)
                .build();

        memberRepository.persist(member2);
    }

    @Test
    @DisplayName("고객조회")
    @Transactional
    void memberFindAll() throws Exception{
        // given

        // when
        List<Member> members = memberRepository.findAll();

        // then
        System.out.println("members = " + members);
    }

}