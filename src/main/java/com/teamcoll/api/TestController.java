package com.teamcoll.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping(value = "/api/test", consumes = "application/json")
    public Member apiTest(@RequestBody  Member member) {
        return member;
    }
}

@Data
class Member {
    @JsonProperty("email")
    private String email;
    @JsonProperty("pwd")
    private String pwd;
}
