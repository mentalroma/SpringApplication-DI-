package ru.medovikov.springcourse.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicalPlayer {
    Music rockMusicFB;
    Music postPunkMusicFB;

    @Autowired
    public MusicalPlayer(@Qualifier("rockMusic") Music rockMusicFB,
                         @Qualifier("postPunkMusic") Music postPunkMusicFB){
        this.rockMusicFB = rockMusicFB;
        this.postPunkMusicFB = postPunkMusicFB;
    }

    public void playMusic(Genre genre){
        switch (genre){
            case ROCK :
                System.out.println(rockMusicFB.getSong());
                break;

            case POSTPUNK :
                System.out.println(postPunkMusicFB.getSong());
                break;
        }
    }
}
