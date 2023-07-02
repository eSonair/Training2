package IndexOfString;

public class IOfS {


    public static void main(String[] args) {
        String haystack, needle;

        IOfS s= new IOfS();

        haystack="sadbutsad";
        needle = "sa";
        System.out.println( s.index(haystack,needle));

    }//Ende Methode Main

    public int index (String haystack, String needle){
        int result = -1;
        boolean br = false; //cont = true
        for(int iStack=0;iStack<haystack.length();iStack++) {
            if(haystack.charAt(iStack) == needle.charAt(0)) {
                result = iStack;
                for(int iNeedle=1;iNeedle<needle.length() && !br;iNeedle++) {
                    if(iStack + iNeedle >= haystack.length())
                        return -1;
                    if(haystack.charAt(iStack+iNeedle) != needle.charAt(iNeedle)) {
                        result = -1;
                        iNeedle = 0;
                        br = true;
                    }
                }
                if(br)
                    br = false;
                else
                    return result;
            }
        }
        return -1;
    }


}//Ende Klasse IOfS
