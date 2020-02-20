package org.devs.teamcoll.domain.team;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.domain.mapping.UserAndTeam;
import org.devs.teamcoll.domain.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @OneToMany(mappedBy = "team")
    private List<UserAndTeam> userAndTeams = new ArrayList<>();

    /*
    @ManyToMany
    private List<User> users;
    */
    @Builder
    public Team(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
