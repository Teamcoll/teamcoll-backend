package com.teamcoll.domain.team.user;

import com.teamcoll.domain.user.User;
import com.teamcoll.domain.user.UserRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @After
    public void cleanALl() {
        userRepository.deleteAll();
    }

    @Test
    public void saveTest() {
        UUID uid = UUID.randomUUID();
        String email = "hsm012362@gmail.com";
        String pwd = "11111";

        userRepository.save(User.builder()
                            .email(email)
                            .pwd(pwd)
                            .build()
        );

        List<User> users = userRepository.findAll();
        User user = users.get(0);

        assertThat(user.getUid()).isEqualTo(uid);
        assertThat(user.getEmail()).isEqualTo(email);
        assertThat(user.getPwd()).isEqualTo(pwd);
    }

}
