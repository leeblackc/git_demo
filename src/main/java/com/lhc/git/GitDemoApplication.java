package com.lhc.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("commit change c1");
        System.out.println("commit change c2");
        System.out.println("test1 commit change c3");
        System.out.println("test1 commit change c4");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
