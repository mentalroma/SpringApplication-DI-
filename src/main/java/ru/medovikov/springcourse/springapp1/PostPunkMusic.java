package ru.medovikov.springcourse.springapp1;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostPunkMusic implements Music{
    List<String> list = new ArrayList<>();

    public PostPunkMusic(){
        list.add("Солнце - Перемотка");
        list.add("Электрический ток - Увула");
        list.add("Я не буду спать - Автоспорт");
    }

    public int Random(int size){
        double a = Math.random() * size ;
        int randomNumber;
        return randomNumber = (int) a;
    }

    @Override
    public String getSong() {
        int randomNumber = Random(3);
        return list.get(randomNumber);
    }
}
