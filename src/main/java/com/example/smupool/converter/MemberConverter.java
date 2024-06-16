package com.example.smupool.converter;

import com.example.smupool.domain.Member;
import com.example.smupool.dto.MemberRequestDTO;
import com.example.smupool.dto.MemberResponseDTO;

public class MemberConverter {

    public static Member toMember(MemberRequestDTO.JoinDTO joinDTO) {
        return Member.builder()
                .studentId(joinDTO.getStudentId())
                .password(joinDTO.getPassword()) // passwordEncoder
                .build();
    }

    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member) {
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(member.getCreatedAt())
                .build();
    }

    public static MemberResponseDTO.MemberPreviewDTO toMemberPreviewDTO(Member member) {
        return MemberResponseDTO.MemberPreviewDTO.builder()
                .memberId(member.getId())
                .studentId(member.getStudentId())
                .createdAt(member.getCreatedAt())
                .updatedAt(member.getUpdatedAt())
                .build();
    }
}
