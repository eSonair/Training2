package SingleNumber;

import java.util.Arrays;

public class SingleNumber1 {

    public static void main(String[] args) {
        //int[] nums = {1,2,1,5,2};
        //int[] nums = {3,1,4,6,1,3,4};
        //int[] nums = {2,4,6,4,2};
        int[] nums = {1,4,6,4,2}; //0,2 ausgelassen ==3,1
        //int[] nums = {0,2,1,4,6,4,2};
        SingleNumber1 s= new SingleNumber1();
        System.out.println("blubb");
        System.out.println(s.singleNumber(nums));
    }//Ende Main


    //Die XOR-Operation (^) setzt ein Bit im Ergebnis auf 1,
    // wenn die beiden Bits an dieser Position unterschiedlich sind, und auf 0, wenn sie gleich sind.
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=3;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
            //ans=nums[i]^nums[i+1];
        }
        return ans;
    }//Ende Methode singleNumber
}//Ende Klasse SingleNumber1
