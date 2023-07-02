package SearchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target=5;

        SearchInsertPosition s = new SearchInsertPosition();

        System.out.println(s.searchInsert(nums, target));

    }//Ende Main Methode

    public int searchInsert(int[] nums, int target) {
        int result=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                result=i;
                break;
            }
        }

        return result;
    }

}//Ende Klasse SearchInsertPosition
