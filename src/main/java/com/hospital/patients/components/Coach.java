package com.hospital.patients.components;

import com.hospital.patients.Interfaces.CoachImpl;
import com.hospital.patients.Interfaces.ThirdCoachImpl;
import org.springframework.stereotype.Component;


@Component
public class Coach implements CoachImpl, ThirdCoachImpl {

    @Override
    public String getDailyWorkout() {
        return "This is just interface implementation uaAmer What about the automatic reload uaAmer ";
    }

    @Override
    public String printInfo() {
        return "This is the Third Coach method Hello UaAmer ";
    }
}

