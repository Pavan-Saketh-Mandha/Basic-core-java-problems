/*
Factors
        a. Desc -> Computes the prime factorization of N using brute force.
        b. I/P -> Number to find the prime factors
        c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
        d. O/P -> Print the prime factors of number N.

@author: Pavan Saketh
@version: 1.0
@since: 12-06-2021

 */

import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter value of N: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primefactors(num);
    }

    private static boolean isPrime(int number) {
        boolean flag = true;

        if (number == 1 || number == 0)
            flag = false;
        else {
            for ( int i=2; i <= number/2; i++) {
                if( number%i ==0)
                    flag = false;
            }
        }
        return flag;
    }

    public static int primefactors(int num) {
        int i = 2;
        if (num > 1) {
            System.out.print("The prime factors are: ");
            while (i*i <= num) {
                if (num % i == 0 && isPrime(i) == true) {
                    System.out.print(i + " ");
                    num = num / i;
                }
                i++;
                if (num == 2) {
                    break;
                }
            }

        }

        else {
            System.out.print("Give number above 1");
        }
        return num;
    }
}
