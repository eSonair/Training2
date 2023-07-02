import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums =  {3,2,2,3};
        int val =3;
        RemoveElement s = new RemoveElement();

        System.out.println("Anzahl d. Elemente: " + s.removeElement(nums, val));

        for (int a: nums){
            System.out.println("Array hat: " + a);
        }

    }//Ende Methode main

    public int removeElement(int[] nums, int val) {
        int nr=0;
        int result;

        for (int i=0; i<nums.length; i++){
            if(val==nums[i]){
                Array.set(nums,i,Integer.MAX_VALUE);
                nr++;
            }
        }
        Arrays.sort(nums);
        result=nums.length-nr;

        return result;
    }

}//Ende Klasse RemoveElement
