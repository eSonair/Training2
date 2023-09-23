package Training2.UglyNumber;
// 4-6 hours... However I combined it with theory as well.
/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.



Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.


Constraints:

-231 <= n <= 231 - 1
 */
public class UglyNumber1 {
    public static void main(String[] args) {
        int n=1;
        //int n=6;

        UglyNumber1 u1= new UglyNumber1();

        System.out.println(u1.isUgly(n));

        //int prim=2, prim1=3, prim2=5;
    }//Ende Methode Main

    public boolean isUgly(int n) {
        int res;
        int index=0;
        int[] nums={2,3,5};

        if(n==1) {
            return true;
        }

        res=n;

        //System.out.println("Blubb1: " + res%nums[index]);

        while(index<3){
            //System.out.println("Miep:" + index);
            if(res%nums[index]==0){
                res/=nums[index];
                if(res==1){
                    return true;
                }
                //System.out.println("Result: " + res);
                //System.out.println("Divisor: " + nums[index]);
            }else         //if(res%nums[index]!=0)
                index++;
                //System.out.println("Index: " + index);
        }
        return false;
    } //Ende Methode isUgly

}//Ende Klasse UglyNumber1
