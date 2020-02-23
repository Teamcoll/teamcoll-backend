package org.devs.teamcoll.repository;

import org.devs.teamcoll.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BoardRepository extends JpaRepository<Board, Long>, Serializable {
}
