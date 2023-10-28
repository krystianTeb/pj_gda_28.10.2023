package org.example;

public class Main {
    public static void main(String[] args) {

        //wersja 1
        int i = 1;
        while(i <= 20){
            System.out.print(i % 3 != 0 ? i + "\n": "");
            i++;
        }

        //wersja 2
        int j = 1;
        while(j <= 20){
            if (j % 3 != 0) System.out.println( j );
            j++;
        }

        //wersja 3
        int x = 1;
        while(x <= 20){
            if (x % 3 != 0) {
                System.out.println( x );
            }
            x++;
        }

    }
}