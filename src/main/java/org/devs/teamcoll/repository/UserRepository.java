package org.devs.teamcoll.repository;

import org.devs.teamcoll.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    User findUserByEmailAndPwd(String email, String pwd);
    User findUserByEmail(String email);
}