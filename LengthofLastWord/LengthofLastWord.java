package LengthofLastWord;

/*
1) in ein Array verpacken
2) von hinten durchgehen.
3) v. hinten beginnend nach einem Leerzeichen suchen.
4) Position übermitteln v. letztem Wort.
5) Ausgeben.
 */

public class LengthofLastWord {

    public static void main(String[] args) {
        String s="aa";
        //Hello World
        //luffy is still joyboy -->6
        //   fly me   to   the moon  -->4
        LengthofLastWord l = new LengthofLastWord();

        System.out.println(l.lengthOfLastWord(s));
    }//Ende Methode Main


    public int lengthOfLastWord(String s) {
        int result=0;
        String s1 =s.trim();
        char blank=' ';

        for(int i=s1.length()-1; i>=0;i--){
            if(Character.compare(s1.charAt(i), blank)==0){
                result=s1.length()-(i+1);
                break;
            }
            else
                result=s1.length();

        }
        return result;
    }
}//Ende Klasse LengthofLastWord

