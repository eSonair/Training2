package Training2.moveZeroes;

// "16 minuten" mit Theorie Kombination 3-4 Stunden


public class moveZeroes1 {

    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};

        moveZeroes1 m1= new moveZeroes1();

        m1.moveZeroes(nums);

        System.out.print("Nums: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]);
        }

    }//Ende Methode Main



    public void moveZeroes(int[] nums) {
        for (int i=0; i<nums.length;i++){
            if(nums[i]==0){
               for (int j=i+1; j<nums.length;j++){
                   if(nums[j]!=0){
                       nums[i]=nums[j];
                       nums[j]=0;
                       break;
                   }
               }
            }
        }
      }//Ende Methode moveZeroes

}//Ende Klasse moveZeroes
