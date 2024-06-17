package com.example.smupool.dto;

import lombok.Getter;

public class MemberRequestDTO {

    @Getter
    public static class JoinDTO {
        private Long studentId; // String?
        private String password;
//        private String name;
//        private String nickname;
//        private String major;
    }

    @Getter
    public static class UpdateMemberDTO {
//        private String password;
        private String name;
        private String nickname;
        private String major;
    }
}
