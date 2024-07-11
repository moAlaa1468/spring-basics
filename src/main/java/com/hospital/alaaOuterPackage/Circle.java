package com.hospital.alaaOuterPackage;


import org.springframework.stereotype.Component;

@Component
public class Circle implements ShapeImpl {
    private int radius;
    private int area;

    @Override
    public String getArea() {
        return "This is just teh area of the circle ";
    }
}
