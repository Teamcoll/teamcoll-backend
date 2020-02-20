package org.devs.teamcoll.dto.todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.domain.todo.Todo;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TodoSaveRequestDto {
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime deadLine;

    @Builder
    public TodoSaveRequestDto(String name, String description,
                              LocalDateTime startDate, LocalDateTime deadLine) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.deadLine = deadLine;
    }

    public Todo toEntity() {
        return Todo.builder()
                .name(name)
                .description(description)
                .startDate(startDate)
                .deadLine(deadLine)
                .build();
    }
}
