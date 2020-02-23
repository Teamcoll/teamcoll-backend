package org.devs.teamcoll.repository;

import org.devs.teamcoll.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface TeamRepository extends JpaRepository<Team,Long>, Serializable {
}
