package com.spotify.configspotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSpotifyApplication.class, args);
	}

}
