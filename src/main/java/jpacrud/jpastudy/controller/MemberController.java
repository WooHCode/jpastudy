package jpacrud.jpastudy.controller;

import jpacrud.jpastudy.dto.MemberDto;
import jpacrud.jpastudy.entity.Member;
import jpacrud.jpastudy.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/api/v1/members")
    public Result<Member> membersV1() {
        List<Member> members = memberService.findMembers();
        List<MemberDto> collect =members.stream()
                .map(member -> new MemberDto(member.getUsername()))
                .collect(Collectors.toList());
        return new Result(collect);
    }

    @Data
    @AllArgsConstructor
    static class Result<T> {
        private T data;
    }
}
