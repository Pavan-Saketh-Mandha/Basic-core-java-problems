/*
Java Program to Check Whether an Alphabet is Vowel or Consonant
@Author: Pavan Saketh
@Version: 1.0
@Since: 12-06-2021

*/

import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter the Aplphabet : ");
        Scanner value = new Scanner(System.in);

        char check = value.next().charAt(0);
        vowelConsonant(check);
    }

    public static void vowelConsonant(char check) {

        // Vowels are [ a,e,i,o,u ]
        if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
            System.out.println("The given Alphabet  " + check + " is a vowel");
        }
        else if (check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U') {
            System.out.println("The given Alphabet  " + check + " is a vowel");
        }
        else {
            System.out.println("The given Alphabet " + check + " is a consonant");
        }
    }
}
