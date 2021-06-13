/*
 Power of 2
         a. Desc -> This program takes a command-line argument N and prints a table of the
         powers of 2 that are less than or equal to 2^N.
         b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
         c. Logic -> repeat until i equals N.
 @author Pavan Saketh
          @version 1.0
          @since 12-06-2021

*/

import java.util.*;
public class PowerOFtwo {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        poweroftwo(num);

    }
    public static void poweroftwo(int num){

        if(num >= 0 && num < 31){

            System.out.println("Powers of 2 are: ");
            int i = 0;

            while(i <= num){

                int Power = (int) Math.pow(2, i);
                System.out.println(Power);
                i++;
            }

        }

        else{
            System.out.println("Please enter the range between 0 to 31");
        }
    }

    }
