package org.example;

public class Main {
    public static void main(String[] args) {

        //Wypisanie wszystkich wartości podzielnych przez 3 z przedziału: 1 do 15
        for(int i = 1; i <= 10; i++) {
            if(i % 3 == 0) {
                System.out.println("Liczba: " + i + "\tpodzielna przez 3");
            }
        }



    }
}