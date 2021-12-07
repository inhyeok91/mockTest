package demo.service;

import demo.entity.Member;
import demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> findMemberAll() {
        return memberRepository.findAll();
    }
}
