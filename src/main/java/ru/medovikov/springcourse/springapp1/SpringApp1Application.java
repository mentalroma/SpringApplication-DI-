package ru.medovikov.springcourse.springapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringApp1Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicalPlayer musicalPlayer = context.getBean("musicalPlayer", MusicalPlayer.class);
        musicalPlayer.playMusic(Genre.POSTPUNK);
    }
}

