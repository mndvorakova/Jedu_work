package org.example;

public class Circle {
    double polomer;


    public Circle(double p) {
        this.polomer = p;
    }

    public double obvod(){
        return 2*Math.PI*polomer;
    }

    public double obsah(){
        return Math.PI *Math.pow(polomer, 2);
    }

}

