package com.spring.stereo.service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereo/service/configService.xml");

        UserService userService = context.getBean("userService", UserService.class);

        User user = new User();
        user.setId(1);
        user.setName("Mario");

        userService.addUser(user);
        userService.getUserById(1);
    }
}
