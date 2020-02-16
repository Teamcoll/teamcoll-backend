package com.teamcoll.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private UUID uid;

    @UniqueElements
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pwd;

    //private Long tid;

    @Builder
    public User(UUID uid, String email, String pwd) {
        this.uid = uid;
        this.email = email;
        this.pwd = pwd;
    }
}
