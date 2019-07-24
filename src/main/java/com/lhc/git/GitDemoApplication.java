package com.lhc.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("commit change c1");
        System.out.println("commit change c2");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
