package SingleNumber;

import java.util.Arrays;

public class SingleNumber {


    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
       SingleNumber s= new SingleNumber();
        System.out.println(s.singleNumber(nums));
    }//Ende Main


    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1]; //last nr
    }//Ende Methode singleNumber
}//Ende Klasse
