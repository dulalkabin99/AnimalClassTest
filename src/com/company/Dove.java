package com.company;
public class Dove extends Bird {

    @Override
    public String sleep() {
        return "A dove sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A dove eats grains.";
    }

    @Override
    public String fly() {
        return "A Dove flies...";
    }

    public String urrCur() {
        return "dove sound Urrr...Currrrrrr...";
    }
}
