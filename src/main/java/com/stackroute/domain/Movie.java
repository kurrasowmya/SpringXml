package com.stackroute.domain;

public class Movie {
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Movie(Actor actor)
    {
        this.actor=actor;
    }
    public Movie()
    {

    }


    Actor actor;



    public void movieDetails()
    {
       actor.printActorDetails();
    }
}
