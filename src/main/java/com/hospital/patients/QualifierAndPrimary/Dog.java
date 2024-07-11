package com.hospital.patients.QualifierAndPrimary;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
// when you will have Two animals You will fail and the program stops
public class Dog implements Animal {

    @Override
    public String makeSound() {
        System.out.println("This is the Dog class And we need to use lazy initialization");
        return "Dog Can make sound ";
    }
}
