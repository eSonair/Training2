package Training2.SummaryRanges;

import java.util.List;

public class SummaryRanges3 {
    public static void main(String[] args) {
        int[] nums =  {0,1,2,4,5,7};

        SummaryRanges3 sR1 = new SummaryRanges3();

        System.out.println(sR1.printRanges(nums));


    }//Ende Methode Main


    public String printRanges(int[] nums) {
        String returnStr = "";
        if(nums.length == 0) {
            return "";
        }
        if(nums.length == 1) {
            return ""+nums[0];
        }

        //0,1,2,4,5,7
        boolean range=false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 == nums[i]) {            //vorige Zahl um 1 kleiner als jz
                if(!range) {                        //range==false;
                    range=true;
                    returnStr += nums[i-1] + "->";   //vorige Zahl = startIndex
                }
            } else {                                    //wenn nicht -->
                range=false;
                returnStr += nums[i-1] + ",";          //Endzahl hinzufügen
            }
        }
        return returnStr + nums[nums.length-1];
    }//Ende Methode printRanges

}//Ende Klasse SummaryRanges3
