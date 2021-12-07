package com.hard.comhard;

import com.hard.comhard.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComhardApplication {

    public static void main(String[] args) {

        User user = new User("1", "2", "3", "4", 18);



        SpringApplication.run(ComhardApplication.class, args);
    }

}
