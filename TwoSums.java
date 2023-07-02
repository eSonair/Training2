//18:09 - 18:17
public class TwoSums {
    static int [] posArray = new int[2];

    public static void main(String[] args) {

        int[] nums={2,3,3,6,7};
        int target=6;

        twoSums(nums, target);
        System.out.println("D. Index ist: " + posArray[0] + " und: " + posArray[1]);

    }//Ende Main


    public static int[] twoSums(int[] nums, int target) {

        int actNr, nxtNr, resNr;

        for (int x=0; x<target;x++){
            for (int y=0; y<nums.length; y++){
                actNr=nums[y];
                nxtNr=nums[y+1];
                resNr=actNr+nxtNr;

                if(resNr==target){
                    posArray[0]=y;
                    posArray[1]=y+1;
                    break;
                }
            }//Ende for 1
        }//Ende for 2
        return posArray;
    }//Ende Methode
}//Ende Klasse
