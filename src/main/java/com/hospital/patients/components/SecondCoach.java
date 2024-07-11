package com.hospital.patients.components;

import com.hospital.patients.Interfaces.CoachImpl;
import com.hospital.patients.Interfaces.SecondCoachImpl;
import org.springframework.stereotype.Component;


@Component
public class SecondCoach implements CoachImpl {

    @Override
    public String getDailyWorkout() {
        return "This is the SecondCoach Class uaAmer ";
    }
}
