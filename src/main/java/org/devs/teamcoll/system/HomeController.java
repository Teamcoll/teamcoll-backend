package org.devs.teamcoll.system;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.config.auth.OAuthAttributes;
import org.devs.teamcoll.config.auth.SessionUser;
import org.devs.teamcoll.domain.user.User;
import org.devs.teamcoll.domain.user.UserRepository;
import org.devs.teamcoll.dto.user.OAuthUserResponse;
import org.devs.teamcoll.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class HomeController {

    private final UserService userService;

    @GetMapping("/")
    public List<OAuthUserResponse> index() {
        return userService.findAll();
    }




}
