package com.spotify.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiMusicApplication.class, args);
    }

}
