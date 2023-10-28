package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź liczbę do weryfikacji: [potwierdź enterem]");
        int liczba = scan.nextInt();

        if(liczba == 1){
            System.out.println("Liczba to 1!");
        } else if (liczba == 2) {
            System.out.println("Liczba to 2!");
        } else if (liczba == 3) {
            System.out.println("Liczba to 3!");
        }else{
            System.out.println("To jest inna liczba!");
        }


    }
}