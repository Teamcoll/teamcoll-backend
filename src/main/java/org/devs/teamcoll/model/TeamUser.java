package org.devs.teamcoll.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class TeamUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamUserId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    private String teamName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User user;

    private String userName;

    private String email;

    @Builder
    public TeamUser(Team team, User user) {
        this.team = team;
        this.teamName = team.getName();
        this.user = user;
        this.email = user.getEmail();
        this.userName = user.getName();
    }
}
