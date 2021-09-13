package com.company;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
       word = scanner.nextLine();
        String wordResult = word.replace(" ", "");
        String wordReplacement =wordResult.replace(",","");
        String stringNormalize = Normalizer.normalize(wordReplacement, Normalizer.Form.NFD);
        String stringWithoutAccents = stringNormalize.replaceAll("[^\\p{ASCII}]", "");
        String invertedWord = "";
       for(int contador = stringWithoutAccents.length() - 1; contador>=0; contador--){



           invertedWord+= stringWithoutAccents.charAt(contador);

       }

       if(stringWithoutAccents.equalsIgnoreCase(invertedWord)){
           System.out.println("Its palindrome");

       }else{
           System.out.println("Not is palindrome");
       }


    }
}
