package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.domain.todo.TodoRepository;
import org.devs.teamcoll.dto.todo.TodoListResponseDto;
import org.devs.teamcoll.dto.todo.TodoSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional
    public void save(TodoSaveRequestDto requestDto) {
        todoRepository.save(requestDto.toEntity());
    }

    /*
    @Transactional(readOnly = true)
    public List<TodoListResponseDto> findAllById(Long team_id){

    }
     */
}
