package jpacrud.jpastudy.service;

import jpacrud.jpastudy.entity.Member;
import jpacrud.jpastudy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    @Transactional
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }


    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public void update(Long id, String name) {
        Member member = memberRepository.findById(id).get();
        member.changeMember(name);
    }
}
