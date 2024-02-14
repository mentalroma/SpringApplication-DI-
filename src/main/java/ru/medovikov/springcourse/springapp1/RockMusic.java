package ru.medovikov.springcourse.springapp1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    List<String> list = new ArrayList<>();

    public RockMusic(){
        list.add("Plug in Baby - Muse");
        list.add("Enter Sandman - Metallica");
        list.add("Black Hole Sun - Soundgarden");
    }

    public int Random(int size){
        double a = Math.random() * size;
        int randomNumber;
        return randomNumber = (int) a;
    }

    @Override
    public String getSong() {
        int randomNumber = Random(3);
        return list.get(randomNumber);
    }
}
