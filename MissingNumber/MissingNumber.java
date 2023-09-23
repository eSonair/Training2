package Training2.MissingNumber;


//15 Minutes...


import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //int[] nums =  {3,0,1};
        int[] nums =  {1,2};
        //int[] nums =  {0,1};
        //int[] nums =  {9,6,4,2,3,5,7,0,1};

        MissingNumber m1 = new MissingNumber();

        System.out.println(m1.missingNumber(nums));

    }//Ende Methode Main

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }

        for (int i=0; i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
    }//Ende Methode missingNumber
}//Ende Klasse MissingNumber
