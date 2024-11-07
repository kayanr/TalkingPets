package io.zipcoder.polymorphism;


import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){

        System.out.println("How many pets do you have? ");
        Scanner response = new Scanner(System.in);
        int petNumber = response.nextInt();
        System.out.println("What kind of pet is each one? ");
        Scanner petResponse = new Scanner(System.in);
        String petKind = petResponse.nextLine();;
    }
}
