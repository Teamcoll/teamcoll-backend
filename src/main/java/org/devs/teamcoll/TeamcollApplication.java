package org.devs.teamcoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TeamcollApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamcollApplication.class, args);
	}

}
