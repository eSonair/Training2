//12:41  //x:12:45 //12:47  //x:13:10  //13:18  //x:13:40 //15:20   //16:45
import java.util.ArrayList;

public class PascalTriangle_false {
    public static ArrayList <Integer> numArray = new ArrayList<>();
    public static ArrayList <Integer> numArray1 = new ArrayList<>();
    public static ArrayList <Integer> midNumArray = new ArrayList<>();
    public static  int numRows=5;

    public static void main(String[] args) {

        numArray.add(1);

    }//Ende Main


    public static void fillArrays(){
        midIndex();
       for (int i=0; i<numRows;i++) {
           if(midNumArray.get(1)==0){            //Wenn d. Array eine gerade Anzahl an Zahlen hat.

           }
       }//Ende for1
    }//Ende Method fillArrays


    public static int indexNr(){
        int result=1;
        result=numArray.size();
        return result;
    }//Ende Method Size.

    public static void midIndex(){
        double index=0, midIndex, midIndex1;
        int odd=0, midIndexInt, midIndexInt1; //0=false

        index=indexNr();

        if((index%2)>0){
            odd=0;
        }
        else
            odd=1;

       switch (odd){
           case 0:
               midIndex=(index/2);
               midIndex1=midIndex+1;

               midIndexInt=(int) midIndex;
               midIndexInt1=(int) midIndex1;
           default:
               Math.ceil(midIndex=(index/2));
               midIndexInt=(int) midIndex;
               midIndexInt1=0;
       }

       midNumArray.add(midIndexInt);
       midNumArray.add(midIndexInt1);
    }//Ende Method midIndex;


}//Ende Klasse
