package com.hospital.patients.lazyInitialization;


import org.springframework.stereotype.Component;

@Component
public class CarTwo implements CarModel {

    public CarTwo() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Constructor : CarTwo ");
    }

    @Override
    public String canWork() {
        return "I am a car and I can work carTwo ";
    }
}
