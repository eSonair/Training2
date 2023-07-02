package PlusOne;

public class PlusOne1 {

    public static void main(String[] args) {
        //int [] digits={1,2,3};
        //int [] digits={4,3,2,1};
        //int [] digits={9};
        //int [] digits={9,9};
        int [] digits={8,9,9,9};
        PlusOne1 p = new PlusOne1();
        int[] resultArray = p.plusOne(digits);

        for (int i=0; i< resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
        //p.plusOne(digits);
    }//Ende Methode Main


    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }//Ende Methode plusONe1

}//Ende Klasse PlusOne1
