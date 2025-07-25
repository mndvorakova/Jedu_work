package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class TridyUceni {
    public static void main(String[] args) {
        Customer[] zakaznici = new Customer[5];

        zakaznici[0] = generujZakaznika("Strcula");
        zakaznici[1] = generujZakaznika("Petřina");
        zakaznici[2] = generujZakaznika("Novák");
        zakaznici[3] = generujZakaznika("Kovář");
        zakaznici[4] = generujZakaznika("Buryanová");

        for (Customer c : zakaznici) {
            System.out.println(c.getSalutation() + " | věk: " + c.getAge() + " | grade: " + c.getRiskGrade());
        }

        double prumer = averageAge(zakaznici);
        System.out.println("\nPrůměrný věk zákazníků: " + prumer);
    }

    // Výpočet průměrného věku
    public static double averageAge(Customer[] customers) {
        int soucet = 0;
        for (Customer c : customers) {
            soucet += c.getAge();
        }
        return (double) soucet / customers.length;
    }

    // Pomocná metoda na vytvoření zákazníka s náhodnými daty
    public static Customer generujZakaznika(String surname) {
        char gender = ThreadLocalRandom.current().nextBoolean() ? 'm' : 'f';
        boolean vip = ThreadLocalRandom.current().nextBoolean();
        int birthYear = ThreadLocalRandom.current().nextInt(1940, 2010 + 1); // třeba 1940–2010
        return new Customer(surname, gender, vip, birthYear);
    }
}
