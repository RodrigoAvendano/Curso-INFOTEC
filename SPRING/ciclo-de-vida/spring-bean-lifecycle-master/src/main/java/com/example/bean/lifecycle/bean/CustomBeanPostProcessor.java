package com.example.bean.lifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifecycleBeanExample) {
            ((LifecycleBeanExample) bean).beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifecycleBeanExample) {
            ((LifecycleBeanExample) bean).afterInit();
        }
        return bean;
    }

}
