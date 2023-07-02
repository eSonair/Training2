
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Input: digits = [9,9]
Output: [1,0,0]

 */
package PlusOne;

/*
1) Letzte Position v. Digits finden u. mit 1 addieren.
2) Alle neuen Zahlen auf eine 1er Stelle brechen
3) Neu einbauen

a) 1 Testcase wurde in d. Angabe damals nicht angegeben "9,9"
b) Angabe missverstanden.

 */

public class PlusOne {
    public static void main(String[] args) {
        //int [] digits={1,2,3};
        //int [] digits={4,3,2,1};
        //int [] digits={9};
        //int [] digits={9,9};
        int [] digits={8,9,9,9};
        PlusOne p = new PlusOne();
        int[] resultArray = p.plusOne(digits);


        for (int i=0; i< resultArray.length;i++){
            System.out.println(resultArray[i]);
        }

        //p.plusOne(digits);
    }//Ende Methode Main


    public int[] plusOne(int[] digits) {
        int digitIndex,indexCounter=0,wNr, lastDigitIndex;
        lastDigitIndex=digits.length-1;
        wNr=lastDigitIndex;
       //digitIndex= digits.length-2;       digitIndex+1
        int [] plusOne;

        //Last Index  +1;
        digits[lastDigitIndex]=digits[lastDigitIndex]+1;


        //clean the array from "9ers".
        while(wNr>=0){          //wNr=1
            if (digits[wNr]>=10 && wNr!=0){                  //if the previous Index...
                digits[wNr-1]=digits[wNr-1]+1;
            }
            wNr--;
        }//Ende While

        //Determine the new maxIndex
        if(digits[0]>=10){
            indexCounter++;
        }
        plusOne= new int[digits.length+indexCounter];       //variable index adjustments

        //int [] digits={8,9,9,9};
        //Chainreaction f. +1
        for (int i=digits.length-1; i>=0; i--){
            if(digits[i]>=10 && i!=0){
                plusOne[i]=digits[i]%10;
            }
            else if(digits[i]>=10 && i==0){
                plusOne[i]=+digits[i]/10;
            }
            else
                plusOne[i]=+digits[i];
        }//Ende for Schleife

        return plusOne;
    }

}//Ende Klasse PLusOne
