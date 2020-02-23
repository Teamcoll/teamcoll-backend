package org.devs.teamcoll.dto.team;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.model.Team;

@Getter
@NoArgsConstructor
public class TeamRegisterRequestDto {
    private Long userId;
    private String name;
    private String description;


    @Builder
    public TeamRegisterRequestDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Team toEntity() {
        return Team.builder()
                .name(name)
                .description(description)
                .build();
    }
}
