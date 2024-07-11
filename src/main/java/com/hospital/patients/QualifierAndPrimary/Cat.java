package com.hospital.patients.QualifierAndPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// This will make the Cat is the primary animal uaAmer
public class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Cat Can make sound ";
    }
}
