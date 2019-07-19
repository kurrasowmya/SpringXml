package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;
    //method to set actorname
    public void setName(String name) {
        this.name = name;
    }
    //method to set actor gender
    public void setGender(String gender) {
        this.gender = gender;
    }
    //method to set actor age
    public void setAge(int age) {
        this.age = age;
    }
    public void printActorDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
    }


}
