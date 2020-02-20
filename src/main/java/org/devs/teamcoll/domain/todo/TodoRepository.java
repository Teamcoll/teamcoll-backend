package org.devs.teamcoll.domain.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface TodoRepository extends JpaRepository<Todo, Long>, Serializable {

}
