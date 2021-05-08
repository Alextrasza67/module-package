package org.alex.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Setter
@Getter
@Component
public class LifecycleExample {

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void postConstruct(){
        System.out.println("LifecycleExample.postConstruct");
    }
}
