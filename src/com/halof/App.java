package com.halof;

public class App {
    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";

        Guitar ibanez = new Guitar();
        ibanez.chords = 6;
        ibanez.name = "Ibanez";

        User userA = new User();
        userA.firstName = "lolof";
        userA.lastName = "pikadas";
        System.out.println(userA.getFullName());
    }
}
