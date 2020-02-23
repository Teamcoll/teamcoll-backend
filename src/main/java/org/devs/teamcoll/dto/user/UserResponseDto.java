package org.devs.teamcoll.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.model.User;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserResponseDto {
    private String email;
    private String name;
    private String picture;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public UserResponseDto(User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.picture = user.getPicture();
        this.createdDate = user.getCreatedDate();
        this.modifiedDate = user.getModifiedDate();
    }
}
