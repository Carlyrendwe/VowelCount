/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6_prog;

import java.util.Scanner;

/**
 *
 * @author khalirendwe
 */
public class IceTask6_PROG {
public static int countVowels(String sentence){
        sentence = sentence.toLowerCase();
        
        //Declaration
        String vowels = "aeiou";
        
        // Variable to store the count of vowels
        int count = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Check if the character is a vowel by checking its index in the vowels string
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
    }
        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Call the countVowels function and display the result
        int numberOfVowels = countVowels(sentence);
        System.out.print("Number of vowels: " + numberOfVowels);
    }
    
}
