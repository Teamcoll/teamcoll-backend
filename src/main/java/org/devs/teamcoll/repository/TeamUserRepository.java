package org.devs.teamcoll.repository;

import org.devs.teamcoll.model.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface TeamUserRepository extends JpaRepository<TeamUser, Long>, Serializable {
}
