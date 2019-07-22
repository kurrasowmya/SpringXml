package com.stackroute.domain;

public class Movie {
    //decalre a object for actor class
    Actor actor;
    //constructor for actor class to initialize object
    public Movie(Actor actor)
    {
        this.actor=actor;
    }
    //method to call the method of actor class
    public void movieDetails()
    {
       actor.printActorDetails();
    }
}
