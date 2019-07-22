package com.stackroute.domain;

public class Actor {
    //Declare variables for Actor class
    private String name;
    private String gender;
    private int age;
    //parameterized constructor to set the variables
    public Actor(String name,String gender,int age)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    //method to print the actor details
    public void printActorDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
    }


}
