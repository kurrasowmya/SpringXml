package com.stackroute.domain;

public class Movie {
    //Declare actor object
    Actor actor;
    //Initialize actor
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //print actor details
    public void movieDetails()
    {
       actor.printActorDetails();
    }
}
