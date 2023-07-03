package Training2;


/*
Duration: 47 min.

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        //int [] nums = {2,2,1,1,1,2,2};
        int [] nums = {3,2,3};

        MajorityElement m1= new MajorityElement();

        System.out.println(m1.majorityElement(nums));
    }//Ende Methode Main

    public int majorityElement(int[] nums) {
        int result=0,actNr=0, actCt=1,maxNr=0,maxCt=1;

        Arrays.sort(nums);
        maxNr=nums[0];


        //   int [] nums = {1,1,1,2,2,2,2}  = 7-1=6
        for (int i=1; i<nums.length;i++)
        {
            if(nums[i]==maxNr){
                maxCt++;
            }
            else if (nums[i]!=maxNr){
                if(actCt>maxCt){
                   maxNr=actNr;
                   maxCt=actCt;
                   actCt=0;
                   /*System.out.println("Max Nr: " + maxNr);
                   System.out.println("Max CT: " + maxCt);
                   System.out.println();*/
                }
                else if(actCt<=maxCt){
                    actNr=nums[i];
                    actCt++;
                    /*System.out.println("Act Nr: " + actNr);
                    System.out.println("Act CT: " + actCt);
                    System.out.println();*/
                }
            }//Ende else if 1.

        }//Ende For-Schleife

        result=maxNr;

        return result;
    }//Ende Methode MajorityElement

}//Ende Klasse MajorityElement
