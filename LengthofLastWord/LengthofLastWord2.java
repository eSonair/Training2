package LengthofLastWord;

public class LengthofLastWord2 {
    public static void main(String[] args) {
        String s="aa";
        //Hello World
        //luffy is still joyboy -->6
        //   fly me   to   the moon  -->4
        LengthofLastWord l = new LengthofLastWord();

        System.out.println(l.lengthOfLastWord(s));
    }//Ende Methode Main


    public int lengthOfLastWord(String s) {
        s=s.trim();
        int op=0;
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)==' '){
                break;
            }
            op++;
        }
        return op;

    }
}
