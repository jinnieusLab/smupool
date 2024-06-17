package com.example.smupool.service.impl;

import com.example.smupool.apiPayload.code.exception.handler.MemberHandler;
import com.example.smupool.apiPayload.code.status.ErrorStatus;
import com.example.smupool.converter.MemberConverter;
import com.example.smupool.domain.Member;
import com.example.smupool.dto.MemberRequestDTO;
import com.example.smupool.repository.MemberRepository;
import com.example.smupool.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Override
    public Member join(MemberRequestDTO.JoinDTO joinDTO) {
        Member member = MemberConverter.toMember(joinDTO);
        return memberRepository.save(member);
    }

    @Override
    @Transactional(readOnly = true)
    public Member readMember(Long memberId) {
        return memberRepository.findById(memberId).orElseThrow(() ->{
            throw new MemberHandler(ErrorStatus._NOT_FOUND_MEMBER);
        });
    }

    @Override
    public void deleteMember(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(()-> new MemberHandler(ErrorStatus._NOT_FOUND_MEMBER));
        memberRepository.delete(member);
    }
}
