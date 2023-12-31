package Training2.SearchInsertPosition;

public class SearchInsertPosition2 {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target=5;

        SearchInsertPosition2 s = new SearchInsertPosition2();

        System.out.println(s.searchInsert(nums, target));

    }//Ende Main Methode

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }


}//Ende Klasse SearchInsertPosition2
