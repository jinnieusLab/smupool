package com.example.smupool.domain;

import com.example.smupool.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;

    @Column(length = 255)
    private String password;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String nickname;

    @Column(length = 20)
    private String major;

//    // FK
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "matching_id")
//    private Matching matching;
}
