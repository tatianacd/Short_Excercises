package com.company;

public class Vector {
    Integer[] numbers = {1, 6, 8, 5, 2, 9, 7};

    public void bubble() {
        Integer[] sortedNumbers;
        int i, j, aux;
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
        sortedNumbers = numbers;
    }

    public String greaterNumber() {
        Integer greater = numbers[0];
        for (int counter = 1; counter < numbers.length - 1; counter++) {
            if (numbers[counter] > greater) {
                greater = numbers[counter];
            }
        }
        return "The greater number is " + greater;
    }

    public Integer minorNumber(){
        Integer minor = numbers[0];
        for(int counter = 1; counter < numbers.length - 1; counter++){
            if(numbers[counter]<minor){
                minor = numbers[counter];
            }
        }

        return minor;
    }

//TODO under contruction
    public Integer secondMinorNotPresent(){
        Integer minorPresent = minorNumber();
        Integer secondMinorNotPresent = 0;
        Integer aux = minorPresent + 1;
        for(int counter = 0; counter< numbers.length - 1; counter++){
            if(aux != numbers[counter]){
                secondMinorNotPresent = aux;

            }

        }



        return secondMinorNotPresent;
    }

    public Boolean verifyIfANumberIs(){
        Integer number = 1234556666;
        for(int counter = 0; counter < numbers.length - 1; counter++){
            if(number == numbers[counter]){
                return true;
            }

        }
        return false;
    }
}

