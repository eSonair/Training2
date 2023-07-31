package Training2.HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber2 {
    public static void main(String[] args) {
        HappyNumber2 hn = new HappyNumber2();
        int n = 19;
        System.out.println("Number " + n + " is " + (hn.happyNumber(n) ? "happy" : "not happy"));
    }

    public boolean happyNumber(int n) {
        List<Integer> nums = new ArrayList<Integer>();
        do {
            nums.add(n);
            n = squareSum(n);
            System.out.println(n);
        } while(n > 1 && !nums.contains(n));
        return n == 1;
    }

    public int squareSum(int n) {
        if(n<10) {
            return n*n;
        }
        return ((n%10)*(n%10)) + squareSum(n/10);
    }
}
