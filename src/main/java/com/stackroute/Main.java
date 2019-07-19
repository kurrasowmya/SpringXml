package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //get bean containing id movie
        Movie ram=context.getBean("movie",Movie.class);
        //call the method to display actor details
        ram.movieDetails();

    }
}
