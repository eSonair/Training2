package Training2.moveZeroes;

// "16 minuten" mit Theorie Kombination 3-4 Stunden


public class moveZeroes2 {

    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};

        moveZeroes2 m1= new moveZeroes2();

        m1.moveZeroes(nums);

        System.out.print("Nums: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]);
        }

    }//Ende Methode Main



    public void moveZeroes(int[] nums) {

        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }



      }//Ende Methode moveZeroes

}//Ende Klasse moveZeroes
