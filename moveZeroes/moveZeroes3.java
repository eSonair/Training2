package Training2.moveZeroes;


public class moveZeroes3 {

    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};

        moveZeroes3 m1= new moveZeroes3();

        m1.moveZeroes(nums);

        System.out.print("Nums: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]);
        }

    }//Ende Methode Main



    public void moveZeroes(int[] nums) {

        int i = 0; // next slot to write
		int zeroCount = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            } else {
				zeroCount++;
			}
        }
		
		/*for (int j = 0; j != zeroCount; j++) {
			nums[nums.length-1-j] = 0;
		}*/

		for (int j = nums.length-1; j >= nums.length-zeroCount; j--) {
			nums[j] = 0;
		}

      }//Ende Methode moveZeroes

}//Ende Klasse moveZeroes