package org.example;

public class Main {
    public static void main(String[] args) {

        int tablica[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("ilość elementów tanlicy: " + tablica.length );
        for(int i = 3; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}