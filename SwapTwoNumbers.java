/*
Java Program to Swap Two Numbers

@Author: Pavan Saketh
@Version: 1.0
@Since: 12-06-2021

*/
import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers you want to swap : ");
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println("Value of two numbers before swap are: ");
        System.out.println("First Number : "+firstNum);
        System.out.println("Second Number : "+secondNum);

        System.out.println("Values of two numbers after swap are: ");
        swap(firstNum,secondNum);
    }

    public static void swap(int firstNum,int secondNum){
        int temp = firstNum;

        firstNum = secondNum;
        secondNum = temp;

        System.out.println("First Number is : "+firstNum);
        System.out.println("Second Number is : "+secondNum);
    }
}
