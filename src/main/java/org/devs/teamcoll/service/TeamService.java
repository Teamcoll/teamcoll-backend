package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.devs.teamcoll.repository.*;
import org.devs.teamcoll.dto.team.TeamRegisterRequestDto;
import org.devs.teamcoll.dto.teamAndUser.RegisterUserToTeamRequestDto;
import org.devs.teamcoll.model.User;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TeamService {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;
    private final TeamUserRepository teamUserRepository;

    public Long save(TeamRegisterRequestDto requestDto) {

        User user = userRepository.findUserByEmail("email");


        log.info("user : {}", user);
        RegisterUserToTeamRequestDto registerUserToTeamRequestDto
                = RegisterUserToTeamRequestDto.builder()
                .user(user)
                .team(requestDto.toEntity())
                .build();

        log.info("여기까지 왔다 ㅋ");
        teamUserRepository.save(registerUserToTeamRequestDto.toEntity());

        return teamRepository.save(requestDto.toEntity()).getTeamId();
    }


}
