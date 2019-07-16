package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie ram = context.getBean("movie1", Movie.class);
        ram.movieDetails();

        Movie ram1 = context.getBean("movie2", Movie.class);
        ram1.movieDetails();

        Movie ram2 = context.getBean("movie3", Movie.class);
        ram2.movieDetails();
    }
}
