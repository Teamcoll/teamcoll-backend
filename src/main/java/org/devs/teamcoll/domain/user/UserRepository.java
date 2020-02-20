package org.devs.teamcoll.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long>, Serializable {


    Optional<User> findByEmail(String email);
}
