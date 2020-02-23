package org.devs.teamcoll.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.model.User;

@Getter
@NoArgsConstructor
public class UserRegisterRequestDto {
    private String email;
    private String pwd;
    private String name;
    private String picture;

    @Builder
    public UserRegisterRequestDto(String email, String pwd, String name, String picture) {
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.picture = picture;
    }

    public User toEntity() {
        return User.builder()
                .email(email)
                .pwd(pwd)
                .name(name)
                .picture(picture)
                .build();
    }
}
