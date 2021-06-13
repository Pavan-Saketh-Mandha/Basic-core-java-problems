/*
Java Program to Check Whether a Number is Even or Odd
@Author: Pavan Saketh
@Version: 1.0
@Since: 12-06-2021

*/
import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner value = new Scanner(System.in);
        int num = value.nextInt();

        evenodd(num);
    }
    public static void evenodd(int num)
    {
        int check = num % 2;
        if (check == 0)
        {
            System.out.println("The given number " + num + " is Even");
        }
        else
        {
            System.out.println("The given number "+ num +" is Odd");
        }
    }
}
