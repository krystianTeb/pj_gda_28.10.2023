package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //scan.useLocale(Locale.US);//umożliwia dodanie wartości . jako przecinek

        System.out.println("Wprowadź saldo konta: [potwierdź enterem]");
        double saldoKonta = scan.nextFloat();
        double oplataZaKonto = saldoKonta * 0.1;
        System.out.println("Saldo konta to: " + saldoKonta +
                           "\nto opłata za konto: " + oplataZaKonto);

    }
}