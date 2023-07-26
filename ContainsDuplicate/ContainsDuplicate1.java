package Training2.ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate1 {
    public static void main(String[] args) {
        //int[] nums =  {1,2,3,1};
        //int[] nums =  {1,2,3,4};
        int[] nums =  {1,1,1,3,3,4,3,2,4,2};


        ContainsDuplicate1 cd1 = new ContainsDuplicate1();

        System.out.println(cd1.containsDuplicate(nums));

    }//Ende Methode Main



    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
    }//Ende Methode containsDuplicate
}//Ende Klasse ContainsDuplicate1
