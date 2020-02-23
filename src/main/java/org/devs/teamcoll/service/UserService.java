package org.devs.teamcoll.service;

import lombok.RequiredArgsConstructor;
import org.devs.teamcoll.model.User;
import org.devs.teamcoll.repository.UserRepository;
import org.devs.teamcoll.dto.user.UserLoginRequestDto;
import org.devs.teamcoll.dto.user.UserRegisterRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long save(UserRegisterRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity()).getUserId();
    }

    @Transactional
    public User validateUser(UserLoginRequestDto requestDto) {
        return userRepository.findUserByEmailAndPwd(requestDto.getEmail(), requestDto.getPwd());
    }

    @Transactional
    public User getUserInfo(String email) {
        return userRepository.findUserByEmail(email);
    }
}
