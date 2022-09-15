package com.picstudio.sideproject.user.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity(name = "USERS")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    //Todo : 2022/09/15 디폴트 0이 아닐때 다른 방법 사용
//    @ColumnDefault(false) // default = 0
    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    // 생성자
    @Builder
    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
