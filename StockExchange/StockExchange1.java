package StockExchange;

public class StockExchange1 {
    public static void main(String[] args) {
        //int[] prices = {7,1,5,3,6,4};
        //int[] prices = {7,6,4,3,1};
        int[] prices = {2,7,1,4,4,1};
        StockExchange1 s = new StockExchange1();

        System.out.println("Das Ergebnis lautet: " + s.solution(prices));


    }//Ende Methode main

    public int solution(int[] prices){
        int index=smallestNr(prices);               //Index v. kleinstem Element wird geholt
        int smNr=prices[smallestNr(prices)];        //kleinstes Element wird geholt.
        int result=0, nr=smNr;


        for (int i=index; i<prices.length;i++){
            if(nr<prices[i]){
                nr=prices[i];
            }
        }
        result=nr-smNr;
        return result;
    }

    public int biggestNr(int[] prices){
        int nr=0;

        for (int i=0; i<prices.length;i++){
            if(nr<=prices[i]){
                nr=prices[i];
            }
        }
        return nr;
    }


    public int smallestNr(int[] prices){
        int nr, index=0;

        nr=biggestNr(prices);

        for (int i=0; i<prices.length;i++){
             if(nr>=prices[i]){
                nr=prices[i];
                index=i;
            }
        }
        return index;
    }//Ende Methode smallesNr.
}//Ende Klasse
