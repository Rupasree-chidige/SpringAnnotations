package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

   private Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;

    }

    public Actor getActor() {
        return actor;
    }
}
