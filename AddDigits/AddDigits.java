package Training2.AddDigits;

// 15-16 Minuten.

public class AddDigits {
    public static void main(String[] args) {
        //int nr=38;
        int nr=0;

        AddDigits ad = new AddDigits();

        System.out.println(ad.addDigits(nr));


    }//Ende Methode main

    public int addDigits(int num) {
        int result=num;
        int nr=0, nr1=0;

        nr=num;

        while(result>=10){
            nr1=nr%10;

            nr=nr-nr1;
            nr=nr/10;

            result=nr+nr1; //11
            nr1=nr;

            nr=result;

        }

        return result;
    }//Ende Methode addDigits

}//Ende Klasse AddDigits
