package com.jenkins.jenkins_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsGithubApplication {

    public static void main(String[] args) {
        System.out.println("启动");
        SpringApplication.run(JenkinsGithubApplication.class, args);
    }

}
