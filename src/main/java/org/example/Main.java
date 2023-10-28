package org.example;

public class Main {
    public static void main(String[] args) {

        //Wypisanie wszystkich wartości podzielnych przez 3 z przedziału: 0 do 60 zwiększane o 10
        // 1ob. i = 0   2ob. i = 10   3ob. i = 20  4ob. i = 30  5ob. i = 40  6ob. i = 50    7ob. i = 60
        for(int i = 0; i <= 60; i+=10) {
            if(i % 3 == 0 && i != 0) {
                System.out.println("Liczba: " + i + "\tpodzielna przez 3");
            }
        }



    }
}