package com.azz.libraryApp.controller;
import com.azz.libraryApp.model.Member;
import com.azz.libraryApp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("member")
    public List<Member> getMembers() {
        return memberService.getAll();
    }

    @GetMapping("member/{id}")
    public Member getMember(@PathVariable Long id) {
        return memberService.getById(id);
    }

    @PostMapping("member")
    public Member addMember(@RequestBody Member member) {
        return memberService.save(member);
    }

    @PutMapping("member/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member updatedMember) {
        try {
            Member member = memberService.update(id, updatedMember);
            return ResponseEntity.ok(member);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("member/{id}")
    public void deleteMember(@PathVariable Long id) {
        memberService.delete(id);
    }


}