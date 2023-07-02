package StockExchange;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
______________________________________________________________________________________________________________________


1) durchgehen d. Arrays
2) Algorithmus erdenken wie ich mich zur größten Distanz zwischen den 2 Zahlen herantasten kann.
3)größte Differenz ausrechnen u. abspeichern.


 */

public class StockExchange {
    public static void main(String[] args) {
        //int[] prices = {7,1,5,3,6,4};
        //int[] prices = {7,6,4,3,1};
        int[] prices = {2,7,1,4,4,1};

        StockExchange s = new StockExchange();

        System.out.println(s.solution(prices));
        //s.solution(prices);


    }//Ende Methode main



    public int solution(int[] prices){
        int result=0;

        for (int i=0; i<prices.length;i++){
            //rückwärts herantasten, aka Algorithmus
            for(int j=prices.length-1;j>i;j--){
                if(result>prices[i]-prices[j]){
                    result=prices[i]-prices[j];
                }
            }//Ende for2
        }//Ende for1

        if(result<0){
            result=result*(-1);
        }
        return result;
    }//Ende Methode solution


}//Ende Klasse StockExchange
