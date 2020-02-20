package org.devs.teamcoll.api;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.dto.todo.TodoListResponseDto;
import org.devs.teamcoll.service.TeamService;
import org.devs.teamcoll.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TodoController {

    private final TodoService todoService;

    /*
    @GetMapping("/team/{id}/todo")
    public List<TodoListResponseDto> TodoList(@PathVariable("id") Long id) {

    }
     */

}
