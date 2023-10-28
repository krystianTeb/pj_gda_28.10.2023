package org.example;

public class Main {
    public static void main(String[] args) {

        //wersja 1
        int i = 1;
        while(i <= 20){
            System.out.println(i % 2 == 0 ? i + " jest parzsta!": i + " jest NIEparzysta!");
            i++;
        }
        //wersja 2
        i = 1;
        while(i <= 20){
            if(i % 2 == 0) {
                System.out.println(i + " jest parzsta!");
            }else{
                System.out.println(i + " jest NIEparzysta!");
            }
            i++;
        }

    }
}