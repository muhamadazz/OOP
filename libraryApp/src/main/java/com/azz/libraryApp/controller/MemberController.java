package com.azz.libraryApp.controller;
import com.azz.libraryApp.model.Member;
import com.azz.libraryApp.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("member")
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @GetMapping("member/{id}")
    public Optional<Member> getMemberById(@PathVariable("id") Long id_member) {
        return memberRepository.findById(id_member);
    }

    @PostMapping("member")
    public Member createMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }
    @PutMapping("member/{id}")
    public Member updateMember(@PathVariable("id") Long idmember, @RequestBody Member memberDetails) {
        Optional<Member> memberOptional = memberRepository.findById(idmember);
        if (memberOptional.isPresent()) {
            Member member = memberOptional.get();
            member.setName(memberDetails.getName());
            member.setEmail(memberDetails.getEmail());
            member.setIdnumber(memberDetails.getIdnumber());
            member.setAddress(memberDetails.getAddress());
            member.setPhone(memberDetails.getPhone());
            return memberRepository.save(member);
        } else {
            throw new RuntimeException("Member not found with id " + idmember);
        }
    }

    @DeleteMapping("member/{id}")
    public void deleteMember(@PathVariable("id") Long id_member) {
        memberRepository.deleteById(id_member);
    }
}