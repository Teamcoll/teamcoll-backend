package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.domain.team.TeamRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;
}
