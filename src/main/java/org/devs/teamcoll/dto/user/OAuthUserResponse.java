package org.devs.teamcoll.dto.user;


import lombok.Getter;
import org.devs.teamcoll.domain.user.Role;
import org.devs.teamcoll.domain.user.User;

import java.io.Serializable;

@Getter
public class OAuthUserResponse {
    private Long id;
    private String email;
    private String name;
    private String picture;
    private Role role;

    public OAuthUserResponse(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.name = user.getName();
        this.picture = user.getPicture();
        this.role = user.getRole();
    }
}
