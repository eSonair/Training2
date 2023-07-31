package Training2.HappyNumber;


import java.util.ArrayList;
import java.util.List;

public class HappyNumber3 {

    /*
    1) Ergebnis  v. x-WH berechnen.
    1a) Anzahl d. Stellen v. Zahl berechnen z.B. ob es eine 10² o. 10³ ist.
    1b) Safety Check ob man nicht bereits d. 1er Stelle erreicht hat.
     */

    public static void main(String[] args) {
        int n;

        n=152;

        HappyNumber3 h1= new HappyNumber3();

        System.out.println(h1.isHappy(n));

    }//Ende Methode Main

    public boolean isHappy(int n) {
        boolean truth=false, running=true;
        int  ct=0;
        List<Integer> nrCache = new ArrayList<>();


        nrCache.add(n);


        while(true){                                   //ich idiot sollte mal echt zwischen Pointer u. Inhalt unterscheiden...
            //System.out.println("Ergebnis: " + getSumm(nrCache));

            if(getSumm(nrCache)<7) {    //# Bedingung rausgeholt. Besser lesbar mit if und else statt if und else if.
                if (getSumm(nrCache) == 1) {
                    return true;
                } else {
                    break;
                }
            }

            ct=counter(getSumm(nrCache));   //# das gehört eigentlich zu digitSplitter dazu. Dann kannst du dir auch den Übergabeparameter sparen
            nrCache= new ArrayList<>(digitSplitter(getSumm(nrCache),ct));


            //all nr².
            for (int i=0; i<nrCache.size();i++){
                nrCache.set(i,squareCalculator(nrCache.get(i)));
            }//Ende For-Schleife

        }//Ende While Schleife.
        return false;
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
            itNr1=(n-itNr)/(10);        //(152-2)/10=15  ||(15-5)/10=1  //# n=n/10 dann brauchst du itNr1 nicht
            n=itNr1;                    //n=15 ||n=1
        }//Ende while-Schleife

        return nrContainer;
    }//Ende Methode digitSplitter


    public int squareCalculator(int n) {
        return n*n; //# kannst du auch in einer Zeile zusammen fassen
    }//Ende Methode digitCalculator



}//Ende Klasse HappyNumber
