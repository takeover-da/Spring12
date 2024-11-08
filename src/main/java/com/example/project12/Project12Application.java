package com.example.project12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  //JPA의 이벤트리스너를 활성화
@SpringBootApplication
public class Project12Application {

  public static void main(String[] args) {
    SpringApplication.run(Project12Application.class, args);
  }

}

