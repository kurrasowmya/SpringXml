package com.stackroute;

import com.stackroute.demo.BeanLifeCycledemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycledemoBean beandemo= context.getBean("BeanLifeCycledemoBean", BeanLifeCycledemoBean.class);
        beandemo.customInit();
        beandemo.customDestroy();


    }
}
