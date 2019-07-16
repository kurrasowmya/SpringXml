package com.stackroute.domain;

public class Actor {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String gender;
    private int age;
    public void printActorDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
    }


}
