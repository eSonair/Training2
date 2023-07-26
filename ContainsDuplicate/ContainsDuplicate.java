package Training2.ContainsDuplicate;

public class ContainsDuplicate {

    //9 Minutes

    public static void main(String[] args) {
        //int[] nums =  {1,2,3,1};
        //int[] nums =  {1,2,3,4};
        int[] nums =  {1,1,1,3,3,4,3,2,4,2};


        ContainsDuplicate cd1 = new ContainsDuplicate();

        System.out.println(cd1.containsDuplicate(nums));

    }//Ende Methode Main



    public boolean containsDuplicate(int[] nums) {

        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }

        return false;

    }//Ende Methode containsDuplicate
}//Ende Klasse ContainsDuplicate
