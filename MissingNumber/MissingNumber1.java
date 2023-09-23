package Training2.MissingNumber;

import java.util.Arrays;

public class MissingNumber1 {
    public static void main(String[] args) {
        //int[] nums =  {3,0,1};
        int[] nums =  {1,2};
        //int[] nums =  {0,1};
        //int[] nums =  {9,6,4,2,3,5,7,0,1};

        MissingNumber m1 = new MissingNumber();

        System.out.println(m1.missingNumber(nums));

    }//Ende Methode Main

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];
        }
        return totalSum - sum;
    }//Ende Methode missingNumber
}//Ende Klasse MissingNumer1
