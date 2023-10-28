package org.example;

public class Main {
    public static void main(String[] args) {

        int i = 0;//wyrażenie inicjujące
        do{
            /*to co ma się wykonać w obiegu pętli*/
            System.out.println("[i = " + i++ + "] obieg pętli");
        }
        while(i < 4);// wyrażenie modyfikujące i wyrażenie warunkowe

    }
}