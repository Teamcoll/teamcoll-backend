package org.devs.teamcoll.system;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
