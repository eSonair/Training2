package Training2.SummaryRanges;

public class SummaryRanges3 {
    public static void main(String[] args) {
        int[] nums =  {0,1,2,4,5,7};

        SummaryRanges3 sR1 = new SummaryRanges3();

        sR1.printRanges(nums);

    }//Ende Methode Main


    public void printRanges(int[] nums) {
        if(nums.length == 0) {
            System.out.println("leer");
            return;
        }
        if(nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }
        if(nums[0]<=0) {
            System.out.println("ungültige Werte");
            return;
        }

        int rangeStart=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 == nums[i]) {
                if(rangeStart == 0) {
                    rangeStart = nums[i - 1];
                    System.out.print(nums[i-1] + "-");
                }
            } else {
                rangeStart = 0;
                System.out.print(nums[i-1] + ",");
            }
        }
        System.out.println(nums[nums.length-1]);
    }
}//Ende Klasse SummaryRanges3
