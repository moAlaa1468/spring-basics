package com.hospital.patients.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Bike implements Vehicle {
    @Override
    public String CouldRide() {
        return "Bike could be ride ";
    }
}
