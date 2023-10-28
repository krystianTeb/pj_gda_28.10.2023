package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int licznik = 0;
        while(licznik < 2) {
            licznik++; // inkrementacja (zwiękczenie licznik o + 1)
            System.out.println("Wprowadź liczbę do weryfikacji: [potwierdź enterem]");
            int liczba = scan.nextInt();

            System.out.println(liczba % 2 == 0 ? "Liczba jest parzysta!" : "Liczba nieparzysta!");
        }


    }
}