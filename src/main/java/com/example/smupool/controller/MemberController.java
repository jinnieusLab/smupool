package com.example.smupool.controller;

import com.example.smupool.apiPayload.BaseResponse;
import com.example.smupool.converter.MemberConverter;
import com.example.smupool.domain.Member;
import com.example.smupool.dto.MemberRequestDTO;
import com.example.smupool.dto.MemberResponseDTO;
import com.example.smupool.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/")
    public BaseResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody MemberRequestDTO.JoinDTO joinDTO) {
        Member member = memberService.join(joinDTO);
        return BaseResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }

    @GetMapping("/{memberId}")
    public BaseResponse<MemberResponseDTO.MemberPreviewDTO> readMember(@PathVariable Long memberId) {
        Member member = memberService.readMember(memberId);
        return BaseResponse.onSuccess(MemberConverter.toMemberPreviewDTO(member));
    }

    @DeleteMapping("/{memberId}")
    public BaseResponse<String> deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
        return BaseResponse.onSuccess("멤버가 삭제되었습니다.");
    }
}
