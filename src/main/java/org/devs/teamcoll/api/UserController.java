package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.devs.teamcoll.model.User;
import org.devs.teamcoll.dto.user.UserLoginRequestDto;
import org.devs.teamcoll.dto.user.UserRegisterRequestDto;
import org.devs.teamcoll.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@CrossOrigin(origins = "*")
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user/*")
@RestController
public class UserController {

    private final UserService userService;

    /**
     * @json requestDto
     * {
     * 	"email" : "email",
     * 	"pwd" : "pwd",
     * 	"name" : "min",
     * 	"picture" : "asdf.jpg"
     * }
     */
    @PostMapping("/register")
    public void join(HttpServletRequest request, HttpServletResponse response, @RequestBody UserRegisterRequestDto requestDto) throws IOException {
        if (!(userService.save(requestDto) > 0))
            response.sendRedirect("http://localhost:8080/login");
    }

    // OAuth2 대체 예정
    @PostMapping("/login")
    public User login(@RequestBody UserLoginRequestDto requestDto, final HttpSession httpSession) {
        httpSession.setAttribute("user", userService.getUserInfo(requestDto.getEmail()));
        log.info("SESSION INFO : {}", httpSession.getAttribute("user"));

        return userService.validateUser(requestDto);
    }

    @GetMapping("/logout")
    public String logout(final HttpSession session) {
        log.info("SESSION OUT : {}", session.getAttribute("user"));
        session.invalidate();
        return "redirect:/";
    }
}
