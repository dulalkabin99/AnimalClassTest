package com.company;

public class Elephant extends Animal {

    public Elephant() {
        super();
        System.out.println("Hello I am an Elephant!");
    }

    @Override
    public String sleep() {
        return "Elephant sleeps...";
    }

    @Override
    public String eat() {
        return "Elephant eats...";
    }

    public String sound() {
        return "Ngyarrrrrrrrr...";
    }
}