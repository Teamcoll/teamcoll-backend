package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

}
