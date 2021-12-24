package com.khj.santaproject.member.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khj.santaproject.member.model.dto.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

	Optional<Member> findByUserIdAndIsLeave(String userId, boolean isLeave);
	
}
