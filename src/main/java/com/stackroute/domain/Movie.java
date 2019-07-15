package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    private ApplicationContext applicationContext;
    private String beanName;
    private BeanFactory beanFactory;

    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;

    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }
}