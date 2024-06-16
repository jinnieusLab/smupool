package com.example.smupool.service;

import com.example.smupool.domain.Member;
import com.example.smupool.dto.MemberRequestDTO;

public interface MemberService {
    Member join(MemberRequestDTO.JoinDTO joinDTO);

    Member readMember(Long memberId);

    void deleteMember(Long memberId);
}
