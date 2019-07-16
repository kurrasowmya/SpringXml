package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
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

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory"+beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println("beanname"+s);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationcontext"+applicationContext);

    }
}
