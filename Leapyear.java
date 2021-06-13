/**
 * Leap Year
 * a. I/P -> Year, ensure it is a 4 digit number.
 * b. Logic -> Determine if it is a Leap Year.
 * c. O/P -> Print the year is a Leap Year or not.
 *
 * @author Pavan Saketh
 * @version 1.0
 * @since 12-06-2021
 */

import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter a year (1000 - 9999): ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        leapyear(year);
    }

    public static int leapyear(int year)
    {
        if ( year > 999 && year < 10000 )
        {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                System.out.println("The year " + year + " is a leap year");
            }

            else{
                System.out.println("The year " + year + " is not a leap year");
            }
        }
        else
        {
            System.out.println("Please enter a four digit number");
        }
        return year;

    }
}
