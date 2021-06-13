/**
 * Flip Coin and print percentage of Heads and Tails
 a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
 b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
 heads
 c. O/P -> Percentage of Head vs Tails
 *
 * @author Pavan Saketh
 * @version 1.0
 * @since 12-06-2021
 */

import java.util.*;

public class FlipCoin {


    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        percentage(num);

    }

    public static int percentage (int num)
    {
        int i = 1;
        double countheads = 0;
        double counttails = 0;

        for (i = 1 ; i <= num ; i++)
        {
            int Coin = (int) (Math.random() * 2);

            if (Coin == 1)
            {
                System.out.println("TAILS");
                counttails++;
            }
            else
            {
                System.out.println("HEADS");
                countheads++;
            }
        }

        System.out.println("heads count: " + countheads);
        System.out.println("Tails count: " + counttails);
        double Headpercent = countheads / (double) num  * 100;
        double Tailpercent = counttails / (double) num  * 100;
        System.out.println("Percentage of Heads: " + Headpercent);
        System.out.println("Percentage of Tails: " + Tailpercent);
        return i;

    }
}
