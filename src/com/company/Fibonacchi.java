package com.company;

public class Fibonacchi {
Integer suma = 0;

    public void fibonacchiNumbers(){
        for(int counter = 0; counter<=100; counter++){
            suma += counter - 1;

        }

        System.out.println(suma);
    }
}
