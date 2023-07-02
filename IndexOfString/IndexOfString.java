package IndexOfString;

public class IndexOfString {


    public static void main(String[] args) {
        String haystack="helao";
        String needle="la";

        IndexOfString s = new IndexOfString();
        System.out.println(s.indexOf(haystack,needle));
    } //Ende Methode Main

    public int indexOf(String haystack, String needle) {
        int result=0;
        char [] cStack=haystack.toCharArray();
        char [] cNeedle=needle.toCharArray();

        if(cStack.length<cNeedle.length){
            return -1;
        }

        for (int i=0; i<haystack.length()-cNeedle.length;i++){
            int counter=0;
            while(counter<cNeedle.length && cStack[i+counter]==cNeedle[counter]){
                counter++;
                if(counter==cNeedle.length){
                    result=i;
                }
            }//End while
        }//Ende for loop
        return result;
    }//Ende Methode indexOf

}//Ende Klasse Main
