package Training2.ContainsDuplicate2;

//10:00 Minuten


import java.util.Arrays;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums =  {0,1,2,3,1};
        //int[] nums =  {1,0,1,1};
        //0,1,2,3,1
        //1,2,3,1,2,3

        int val=3;

        ContainsDuplicateII cd1 = new ContainsDuplicateII();
        System.out.println(cd1.containsDuplicate(nums,val));

    }//Ende Methode Main


    boolean containsDuplicate (int[] nums, int val){

        for (int i=nums.length-1; i>=0; i--){
            System.out.println("ArrayLänge: " + nums.length);
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    System.out.println("J: " + j);
                    if(i-j==val){
                        return true;
                    }//If 1
                }//If 2
            }//For 1
        }//For 2


        return false;
    }//Ende Methode ContainsDuplicate2


}//Ende Klasse ContainsDuplicateII
