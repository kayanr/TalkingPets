package io.zipcoder.pets;

public class Hamster extends Pet{
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Squeak");
    }
}
