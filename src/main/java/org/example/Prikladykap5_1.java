package org.example;

public class Prikladykap5_1 {
    public static void main (String[] args) {

        Circle kruh = new Circle(10);  //konstruktor

        System.out.printf("Obvod kruhu: %.2f\n", kruh.obvod() );
        System.out.printf("Obsah kruhu: %.2f\n", kruh.obsah());

    }

}

