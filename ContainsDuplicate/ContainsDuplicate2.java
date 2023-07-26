package Training2.ContainsDuplicate;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        //int[] nums =  {1,2,3,1};
        //int[] nums =  {1,2,3,4};
        int[] nums =  {1,1,1,3,3,4,3,2,4,2};


        ContainsDuplicate2 cd1 = new ContainsDuplicate2();

        System.out.println(cd1.containsDuplicate(nums));

    }//Ende Methode Main



    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;

    }//Ende Methode containsDuplicate

}//Ende Klasse ContainsDuplicate2

