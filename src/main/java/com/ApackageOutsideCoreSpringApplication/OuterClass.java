package com.ApackageOutsideCoreSpringApplication;

public class OuterClass {
    private String name = "I am foreign Class  ";

    public  String foreignFunction() {
        return this.name;
    }
}
