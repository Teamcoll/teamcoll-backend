package org.devs.teamcoll.dto.todo;

import lombok.Getter;
import org.devs.teamcoll.domain.todo.Todo;

import java.time.LocalDateTime;

@Getter
public class TodoListResponseDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime deadLine;

    public TodoListResponseDto(Todo todo) {
        this.id = todo.getId();
        this.name = todo.getName();
        this.description = todo.getDescription();
        this.startDate = todo.getStartDate();
        this.deadLine = todo.getDeadLine();
    }
}
