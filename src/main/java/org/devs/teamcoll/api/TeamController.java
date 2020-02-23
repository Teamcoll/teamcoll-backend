package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.devs.teamcoll.model.User;
import org.devs.teamcoll.dto.team.TeamRegisterRequestDto;
import org.devs.teamcoll.service.TeamService;
import org.devs.teamcoll.service.TeamUserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(origins = "*")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/team/*")
public class TeamController {

    private final TeamService teamService;
    private final TeamUserService teamUserService;

    @PostMapping("/register")
    public Long register(@RequestBody TeamRegisterRequestDto requestDto , HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        return teamService.save(requestDto);

    }
}
