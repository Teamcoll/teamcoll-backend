package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.service.BoardService;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;
}
