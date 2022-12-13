package com.example.bean.lifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "lifecycleBean")
public class LifecycleBeanExample implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    // Constructor implementation
    public LifecycleBeanExample() {
        System.out.println("## LyfecycleBeanExample constructor called.");
    }

    // Implemented from InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## afterPropertiesSet from InitializingBean called. " +
                "The LyfecycleBeanExample bean has it's properties set.");
    }

    // Implemented from DisposeableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy from DisposableBean called. The lifecycle for bean" +
                " LifecycleBeanExample has been terminated.");
    }

    // Implemented from BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("## setBeanName from BeanNameAware called with name: " + name);
    }

    // Implemented from BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## setBeanFactory from BeanFactoryAware called." +
                " BeanFactory has been set.");
    }

    // Implemented from ApplicaticationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## setApplicationContext for ApplicationContextAware called." +
                " Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## postConstruct annotated method called for LifecycleBeanExample bean.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## preDestroy annotated method called for LifecycleBeanExample bean.");
    }

    public void beforeInit() {
        System.out.println("## beforeInit method called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## afterInit method called by Bean Post Processor");
    }
}
