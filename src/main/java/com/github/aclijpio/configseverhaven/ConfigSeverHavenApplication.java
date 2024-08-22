package com.github.aclijpio.configseverhaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSeverHavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSeverHavenApplication.class, args);
    }

}
