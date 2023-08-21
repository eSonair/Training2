package Training2.SummaryRanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges2 {

    public static void main(String[] args) {
        int[] nums =  {0,1,2,4,5,7};
        //int[] nums =  { 0,2,3,4,6,8,9};

        SummaryRanges2 sR1 = new SummaryRanges2();

        System.out.println(sR1.summaryRanges(nums));

    }//Ende Methode Main


    //0,1,2,4,5,7
    public List summaryRanges(int[] nums) {
      int indexStart=0, indexEnd=0, counter=0;
      List<String> al = new ArrayList();

      for (int i=0; i<nums.length;i++){
          while(i<nums.length-1 && nums[i]+1==nums[i+1]){
              i++;
              counter++;
          }
          if (i==nums.length-1 && counter>0){
              indexEnd=i;
              al.add(nums[indexStart] + "-->" + nums[indexEnd]);
              break;
          }

          //0,1,2,4,5,7
          //0,2,3,4,6,8,9 --> 7 Elements
          //index 4 (6) startIndex= 4
          //index 5 (8)
          //index 6 (9)
          if(i<nums.length-1 && nums[i]+1!=nums[i+1] &&counter>0){
              indexEnd=i;
              al.add(nums[indexStart] + "-->" + nums[indexEnd]);
              indexStart=indexEnd+1;
              counter=0;
          }
          else{
              al.add(""+nums[i]);
              indexStart=i+1;
          }



      }//Ende For-Schleife

      return al;
    }//Ende Methode SummaryRanges


} //Ende Methode SummrayRanges
