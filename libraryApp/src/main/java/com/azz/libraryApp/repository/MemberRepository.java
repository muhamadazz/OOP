package com.azz.libraryApp.repository;

import com.azz.libraryApp.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// MemberRepository.java
public interface MemberRepository extends JpaRepository<Member, Long> {
}

