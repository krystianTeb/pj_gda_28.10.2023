package org.example;

public class Main {
    public static void main(String[] args) {

        //Wypisanie wszystkich wartości podzielnych przez 3 z przedziału: 0 do 60 zwiększane o 10
        for(int i = 0; i <= 60; i+=10) {
            if(i % 3 == 0 && i != 0) {
                System.out.println("Liczba: " + i + "\tpodzielna przez 3");
            }
        }



    }
}