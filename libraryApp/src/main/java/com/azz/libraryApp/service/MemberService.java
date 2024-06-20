package com.azz.libraryApp.service;

import com.azz.libraryApp.model.Member;
import com.azz.libraryApp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    public Member getById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public Member update(Long id, Member updatedmember) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isPresent()) {
            Member existmember = member.get();
            existmember.setName(updatedmember.getName());
            existmember.setEmail(updatedmember.getEmail());
            existmember.setPhone(updatedmember.getPhone());
            existmember.setAddress(updatedmember.getAddress());
            return memberRepository.save(existmember);
        } else {
            throw new RuntimeException("Member not found");
        }
    }

    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
