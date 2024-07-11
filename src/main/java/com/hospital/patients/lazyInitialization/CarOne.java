package com.hospital.patients.lazyInitialization;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//This line will make new OBJECT for every injection
public class CarOne implements CarModel {
    private String name;


    public CarOne() {
        // This will be used to print the class name
        System.out.println(getClass().getSimpleName());
        System.out.println("Constructor : Car One");
    }

    // We need to insert some code during initializing uaAmer

    @PostConstruct
    public void destructSomeCode() {
        name = "Mohamed Alaa amer is here ";
        System.out.println(name);
    }


    @PreDestroy
    public void CodeInitializing() {
        name = "This is Destruction of the Object taken From this class ";
        System.out.println(name);
    }


    @Override
    public String canWork() {
        return "CarOne fucntion";
    }
}
