package org.example;

public class Main {
    public static void main(String[] args) {
        // 1 wersja
        for(int i = 1; i <= 10; i++){
            System.out.print(i % 2 == 0 ? i + "\n":"");
        }
        //2wersja
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0 ) System.out.println(i);
        }
        //3wersja
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0 ) {
                System.out.println(i);
            }
        }
    }
}