package org.devs.teamcoll.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BoardRepository extends JpaRepository<Board, Long> , Serializable {
}
