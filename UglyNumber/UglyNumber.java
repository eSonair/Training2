package Training2.UglyNumber;

public class UglyNumber {
    public static void main(String[] args) {

        //int n=14;
        int n=6;


        UglyNumber u1= new UglyNumber();

        System.out.println( u1.isUgly(n));

        //int prim=2, prim1=3, prim2=5;

    }//Ende Methode Main

    public boolean isUgly(int n) {
        boolean truth=false, permission=true, end=true;
        int[] nums={2,3,5};
        int indicator=0;

        if (n==1 && indicator<3){
            return false;
        }
        else if (n==1 && indicator>=3)
            return true;

        while(end){
            permission=isZero(n,nums[indicator]);       //true

            if(permission && indicator<3){
                System.out.println("Zahl: " + n);
                System.out.println("Divisor: " + nums[indicator]);
                n=n/nums[indicator];
                System.out.println("Ergebnis: " + n);
            }
            else{
                indicator++;
            }


        }  //Ende while-Schleife
        return true;
    } //Ende Methode isUgly

    public boolean isZero(int n, int divisor) {
        int result=0;
        result=n%divisor;

        //System.out.println("Result: " +result);

        if(result==0){
            return true;
        }
        return false;
    }//Ende Methode isInt


}//Ende Klasse UglyNumber
