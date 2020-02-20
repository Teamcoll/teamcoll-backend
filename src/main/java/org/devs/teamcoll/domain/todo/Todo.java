package org.devs.teamcoll.domain.todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devs.teamcoll.domain.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Todo extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime deadLine;

    @Builder
    public Todo(String name, String description, LocalDateTime startDate, LocalDateTime deadLine) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.deadLine = deadLine;
    }
}
