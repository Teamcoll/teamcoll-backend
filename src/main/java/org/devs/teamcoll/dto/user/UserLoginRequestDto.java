package org.devs.teamcoll.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserLoginRequestDto {
    private String email;
    private String pwd;

    @Builder
    public UserLoginRequestDto(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }
}
