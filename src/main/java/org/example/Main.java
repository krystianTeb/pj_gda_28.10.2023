package org.example;

public class Main {
    public static void main(String[] args) {
        //1 sposób z użyciem continue
        for(int i = 0; i <= 10 ;i++){
            if(i % 2 == 0){
                continue;//przerwanie obecnej iteracji (obiegu pętli)
            }
            System.out.println(i);
        }
        //2 sposób bez użycia continue
        for(int i = 0; i <= 10 ;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }

        }


    }
}