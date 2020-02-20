package org.devs.teamcoll.domain.team;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface TeamRepository extends JpaRepository<Team, Long>, Serializable {
}
