package com.company;

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());
        System.out.println("=====================================================");


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());
        System.out.println("=====================================================");


        Cow cow = new Cow();
        print(cow.eat());
        print(cow.sleep());
        print(cow.Moo());
        System.out.println("=====================================================");


        Dog dog = new Dog();
        print(dog.eat());
        print(dog.sleep());
        print(dog.bark());
        System.out.println("=====================================================");

        Elephant elephant = new Elephant();
        print(elephant.eat());
        print(elephant.sleep());
        print(elephant.sound());
        System.out.println("=====================================================");

        Dove dove = new Dove();
        print(dove.eat());
        print(dove.sleep());
        print(dove.urrCur());

        System.out.println("=====================================================");



    }

    private static void print(String s){
        System.out.println(s);
    }
}
