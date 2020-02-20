package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.service.TeamService;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TeamController {

    private final TeamService teamService;


}
