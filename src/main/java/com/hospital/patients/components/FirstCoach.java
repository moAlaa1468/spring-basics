package com.hospital.patients.components;

import com.hospital.patients.Interfaces.CoachImpl;
import org.springframework.stereotype.Component;


@Component
public class FirstCoach implements CoachImpl {
    @Override
    public String getDailyWorkout() {
        return "This is the first Coach ";
    }
}
