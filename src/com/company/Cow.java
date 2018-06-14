package com.company;
public class Cow extends Animal {

    public Cow() {
        // super();
        System.out.println("Hello I am a cow!");
    }

    @Override
    public String sleep() {
        return "A cow sleeps...";
    }

    @Override
    public String eat() {
        return "A cow eats...";
    }

    public String Moo() {
        return "Moo...";
    }
}
