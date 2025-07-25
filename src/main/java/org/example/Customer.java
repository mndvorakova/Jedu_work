package org.example;

import java.util.Calendar;

public class Customer {
    public String surname;
    public char gender;
    public boolean vip;
    public int birthYear;

    //Konstruktor pro surname a gender
    public Customer(String surname, char gender) {
        this.surname = surname;
        this.gender = gender;
        this.vip = false;  //poradila IDEA
        this.birthYear = 1900; //IDEA
    }

    //konstruktor s vip, přidán birtYear
    public Customer(String surname, char gender, boolean vip, int birthYear) {
        this.surname = surname;
        this.gender = gender;
        this.vip = vip;
        this.birthYear = birthYear;
    }

    //vrátí risk grade
    public String getRiskGrade() {
        int age = getAge();

        if (vip) {
            return "A";
        } else if (age >= 18 && age < 65) {  //ne-vip
            return "B";
        } else {
            return "C"; //zbytek
        }
    }

    //počítání věku
    public int getAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.birthYear;
    }



    //oslovení podle gender a risk grade
    public String getSalutation() {
        String grade = getRiskGrade();
        String titul = "";

        if (gender == 'f') {
            if (grade.equals("A")) titul = "Velevážená paní ";
            else if (grade.equals("B")) titul = "Vážená paní ";
            else titul = "Brýden pan";
        } else {
            if (grade.equals("A")) titul = "Velevážený pan ";
            else if (grade.equals("B")) titul = "Vážený pan ";
            else titul = "Brýden pan ";
        }
        return titul;
    }

    public String getFormalGreeting() {
        String titul = getSalutation();
        String nameOut = surname;

        if (surname.equals("Novák")) nameOut = "Nováku";
        if (surname.equals("Kovář")) nameOut = "Kovy";

        return titul + nameOut;
    }
}