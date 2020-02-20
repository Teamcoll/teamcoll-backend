package org.devs.teamcoll.domain.mapping;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.domain.team.Team;
import org.devs.teamcoll.domain.user.User;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class UserAndTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public UserAndTeam(Team team, User user) {
        this.team = team;
        this.user = user;
    }

}
