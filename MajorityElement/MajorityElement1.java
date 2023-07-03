package Training2.MajorityElement;


//Duration: 5 min.

import java.util.Arrays;

public class MajorityElement1 {
    public static void main(String[] args) {
        //int [] nums = {2,2,1,1,1,2,2};
        int [] nums = {3,2,3};

        MajorityElement1 s1= new MajorityElement1();

        System.out.println(s1.majorityElement(nums));
    }//Ende Methode Main

    public int majorityElement(int[] nums) {
       int result=0, divisor;

       divisor=(nums.length-1)/2;

       Arrays.sort(nums);
       result= nums[divisor];

       return result;
    }//Ende Methode Training2.MajorityElement.MajorityElement

}//Ende Klasse MajorityElement1
