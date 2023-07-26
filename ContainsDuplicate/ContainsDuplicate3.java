package Training2.ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate3 {

    public static void main(String[] args) {
        //int[] nums =  {1,2,3,1};
        //int[] nums =  {1,2,3,4};
        int[] nums =  {1,1,1,3,3,4,3,2,4,2};


        ContainsDuplicate3 cd1 = new ContainsDuplicate3();

        System.out.println(cd1.containsDuplicate(nums));

    }//Ende Methode Main



    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }//Ende Methode containsDuplicate


}//Ende Klasse ContainsDuplicate3
