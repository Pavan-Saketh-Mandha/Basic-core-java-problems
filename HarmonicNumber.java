/*
Harmonic Number
        a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
        (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
        b. I/P -> The Harmonic Value N. Ensure N != 0
        c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
        d. O/P -> Print the Nth Harmonic Value.
@Author: Pavan Saketh
@Version: 1.0
@Since: 12-06-2021

*/

import java.util.*;
public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter value N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        float nharmonic = harmonic(N);
        System.out.println("The Nth Harmonic value is: " + nharmonic);

    }
    public static float harmonic(int N)
    {
        int i = 2;
        float result = 1;

        while ( i <= N)
        {
            result += (float) 1 / i ;
            i++;
        }

        return result;
    }

}
