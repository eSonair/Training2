package Training2.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber1 {

    public static void main(String[] args) {
        int n;

        n=4;
        HappyNumber1 h1= new HappyNumber1();

        System.out.println(h1.isHappy(n));

    }//Ende Methode Main


    public boolean isHappy(int n) {
        // Create a set to keep track of the numbers that have already been seen
        Set<Integer> seen = new HashSet<>();

        // Loop until either n becomes 1 (in which case n is a happy number) or n is seen again (in which case n is not a happy number)

        while (n != 1 && !seen.contains(n)) {
            // Add n to the set of seen numbers
            seen.add(n);

            // Compute the sum of the squares of the digits of n
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            // Update n with the sum of the squares of its digits
            n = sum;
        }

        // If n is 1, it is a happy number; otherwise, it is not
        return n == 1;
    }//Ende Methode isHappy

}//Ende Klasse HappyNumber1
