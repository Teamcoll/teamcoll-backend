package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.domain.board.BoardRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
}
