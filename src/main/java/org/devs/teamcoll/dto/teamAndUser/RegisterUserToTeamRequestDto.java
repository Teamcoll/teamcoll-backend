package org.devs.teamcoll.dto.teamAndUser;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.devs.teamcoll.model.Team;
import org.devs.teamcoll.model.TeamUser;
import org.devs.teamcoll.model.User;

@Getter @Setter
@NoArgsConstructor
public class RegisterUserToTeamRequestDto {
    private Team team;
    private String teamName;
    private User user;
    private String email;
    private String userName;

    @Builder
    public RegisterUserToTeamRequestDto(Team team, User user) {
        this.team = team;
        this.teamName = team.getName();
        this.user = user;
        this.email = user.getEmail();
        this.userName = user.getName();
    }

    public TeamUser toEntity() {
        return TeamUser.builder()
                .team(team)
                .user(user)
                .build();
    }
}
