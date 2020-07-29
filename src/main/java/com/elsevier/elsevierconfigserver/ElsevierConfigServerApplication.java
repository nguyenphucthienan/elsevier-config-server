package com.elsevier.elsevierconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ElsevierConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ElsevierConfigServerApplication.class, args);
  }
}
