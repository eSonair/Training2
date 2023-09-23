package Training2.moveZeroes;

public class moveZeroes {

    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};

        moveZeroes m1= new moveZeroes();

        m1.moveZeroes(nums);

        System.out.print("Nums: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]);
        }
        /*
         */

        //System.out.println("");


    }//Ende Methode Main



    public void moveZeroes(int[] nums) {
        String s="";
        int ct=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) {
                //System.out.println("0: " + nums[i]);
                ct++;
                continue;
            }else if(nums[i]!=0){
                //System.out.println("Zahl: " + nums[i]);
                s+=nums[i]+"";
            }//Ende If-Abfrage
        }//Ende For

        for (int i=0; i<ct;i++){
            s+=""+0;
            System.out.println("s: " + s);
        }

        char [] sChar=s.toCharArray();

        /*
         System.out.println("Nur charArray:");
        for(char a:sChar){
            System.out.print(a);
        }
         */



        //length=5-->4
        //0,1,0,3,12

        for(int i=0; i<nums.length;i++){
            nums[i]=sChar[i]-48;
            //System.out.println("I:" + i);
            //System.out.println("Übertragung: " + nums[i]);
        }

        /*
         for(int i=0; i<nums.length; i++){
            System.out.println("Nums neu: " + nums[i]);
        }

         */


      }//Ende Methode moveZeroes

}//Ende Klasse moveZeroes
