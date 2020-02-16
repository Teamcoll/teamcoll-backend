package com.teamcoll.domain.team;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;


    @Column( columnDefinition = "DATE")
    private Date regdate;

    @Column(columnDefinition = "TEXT")
    private String description;

}
