package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycledemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {

    }

    public void afterPropertiesSet() throws Exception {

    }
    public void customInit()
    {
        System.out.println("customInit() called");
    }

    public void customDestroy()
    {
        System.out.println("customDestroy() called , closing opened resources");
    }
}
