package Training2.HappyNumber;

//Duration:  2 Std u. 43 min -.-"

import java.util.ArrayList;
import java.util.List;

/*

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Example 2:

Input: n = 2
Output: false
 */
public class HappyNumber {

    /*
    1) Ergebnis  v. x-WH berechnen.
    1a) Anzahl d. Stellen v. Zahl berechnen z.B. ob es eine 10² o. 10³ ist.
    1b) Safety Check ob man nicht bereits d. 1er Stelle erreicht hat.
     */

    public static void main(String[] args) {
        int n;

        n=7;

        HappyNumber h1= new HappyNumber();

        System.out.println(h1.isHappy(n));

    }//Ende Methode Main

    public boolean isHappy(int n) {
        boolean truth=false, running=true;
        int  ct=0;
        List <Integer> nrCache = new ArrayList<>();


        nrCache.add(n);


        while(truth==false){                                   //ich idiot sollte mal echt zwischen Pointer u. Inhalt unterscheiden...

            //System.out.println("Ergebnis: " + getSumm(nrCache));

            if(getSumm(nrCache)==1 && getSumm(nrCache)<7){
                truth=true;
                return truth;
            } else if (getSumm(nrCache)!=1 && getSumm(nrCache)<7) {
                truth=false;
                break;
            }

            ct=counter(getSumm(nrCache));
            nrCache= new ArrayList<>(digitSplitter(getSumm(nrCache),ct));


            //all nr².
            for (int i=0; i<nrCache.size();i++){
                nrCache.set(i,squareCalculator(nrCache.get(i)));
            }//Ende For-Schleife

        }//Ende While Schleife.
        return truth;
    }//Ende Methode isHappy



    public int getSumm(List <Integer> x) {
        int result=0;
        for(int i=0; i<x.size(); i++){
            result=result+x.get(i);
        }
        return result;
    }


    //1a
    public int counter(int x) {
        int result=1;
        String nr;

        nr=""+x;
        result=nr.length()-1;           //2 Stellen -->10^1=10

        return result;
    }


    //1b
    public List <Integer> digitSplitter(int n, int ct) {
        List<Integer> nrContainer= new ArrayList<>();
        int itNr, itNr1, itNr2; //intermediateNr; ZwNr.

        //ct=counter(n);      //z.B. 2

        while (ct>=0){
            ct--;
            itNr=n%10;                   //152%2=2;  ||15%10=5
            nrContainer.add(itNr);       //2  ||5
            itNr1=(n-itNr)/(10);        //(152-2)/10=15  ||(15-5)/10=1
            n=itNr1;                    //n=15 ||n=1
        }//Ende while-Schleife

        return nrContainer;
    }//Ende Methode digitSplitter


    public int squareCalculator(int n) {
        int result=0;

        result=n*n;

        return result;
    }//Ende Methode digitCalculator



}//Ende Klasse HappyNumber
