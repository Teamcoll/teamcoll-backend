package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.domain.todo.TodoRepository;
import org.devs.teamcoll.domain.user.User;
import org.devs.teamcoll.domain.user.UserRepository;
import org.devs.teamcoll.dto.user.OAuthUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<OAuthUserResponse> findAll() {
        return userRepository.findAll().stream().
                map(OAuthUserResponse::new)
                .collect(Collectors.toList());
    }
}
