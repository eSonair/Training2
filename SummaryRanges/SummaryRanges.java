package Training2.SummaryRanges;

import java.util.ArrayList;
import java.util.Arrays;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums =  {0,1,2,4,5,7};

        SummaryRanges sR1 = new SummaryRanges();

        System.out.println(sR1.summaryRanges(nums));

    }//Ende Methode Main





    public String summaryRanges(int[] nums) {
        String s="";
        Arrays.sort(nums);
        ArrayList <Integer> aL1= new ArrayList<>();



        //0,1,2,4,5,7
        for (int i=0; i<nums.length; i++){
            if(i!=nums.length-1){
                if (nums[i]+1==nums[i+1]) {
                    aL1.add(nums[i]);

                    System.out.println("Test: " + s);
                }
                else if (nums[i]-nums[i-1]==1){
                    aL1.add(nums[i]);
                    System.out.println("Test1: " + s);
                }
                else {
                    s+=aL1.get(0)+"-->"+aL1.get(aL1.size()-1)+",";
                    s+=nums[i];
                    System.out.println("Test2: " + s);
                    aL1.clear();

                }
            }
        }
        System.out.println("hi" + s);
        return s;
    }//Ende Methode SummaryRanges


}//Ende Klasse SummaryRanges
