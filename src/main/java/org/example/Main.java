package org.example;

public class Main {
    public static void main(String[] args) {

        //wersja 1
        for(int i = 1; i <= 20; i++){
            System.out.println(i % 2 == 0 ? i + " jest parzsta!": i + " jest NIEparzysta!");
        }
        //wersja 2
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0) {
                System.out.println(i + " jest parzsta!");
            }else{
                System.out.println(i + " jest NIEparzysta!");
            }
        }

    }
}