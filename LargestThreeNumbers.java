/*
Java Program to Find the Largest Among Three Numbers
@Author: Pavan Saketh
@Version: 1.0
@Since: 12-06-2021

*/

import java.util.*;
public class LargestThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers: ");
        Scanner value = new Scanner(System.in);
        int number1 = value.nextInt();
        int number2 = value.nextInt();
        int number3 = value.nextInt();

        largestnumber(number1,number2,number3);

    }
      public static void largestnumber(int number1, int number2, int number3)
      {
          if(number1 > number2 && number1 > number3)
          {
              System.out.println("Largest number Among Three Numbers is: "+ number1);
          }
          else if(number2 > number3)
          {
              System.out.println("Largest number Among Three Numbers is: "+ number2);
          }
          else
          {
              System.out.println("Largest number Among Three Numbers is: "+ number3);
          }
      }
}
