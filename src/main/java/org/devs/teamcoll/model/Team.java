package org.devs.teamcoll.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.model.TeamUser;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private Long teamId;

    @Column(name = "TEAM_NAME")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEAM_ID")
    private List<TeamUser> teamUsers = new ArrayList<>();

    @Builder
    public Team(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
