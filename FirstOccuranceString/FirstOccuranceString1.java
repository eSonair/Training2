package FirstOccuranceString;

public class FirstOccuranceString1 {
    public static void main(String[] args) {
        String haystack, needle;

        FirstOccuranceString1 s= new FirstOccuranceString1();

        haystack="sadbutsad";
        needle = "sad";
        System.out.println( s.strStr(haystack,needle));

    }//Ende Methode Main

    public int strStr(String haystack, String needle) {
        int result=0, pos=0, counter;
        String test="";
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int [] arrayIndex = new int [haystackArray.length];     //Hier speichere ich alle Pos v. haystack d. vorkommenden Buchstaben ab.
        counter=needleArray.length;

        if(haystack.contains(needle)){
            for (int i=0; i<needleArray.length;i++){
                for(int j=0; j<haystackArray.length;j++){
                    if (haystackArray[j]==needleArray[i]){
                        test=test.concat(""+haystackArray[j]);
                        arrayIndex[counter]=j;
                        counter++;

                        if(test.equals(needle)){
                            pos=counter-needle.length();     //Bisher hoch gezählte Pos. im tmp Array liest nur wahre coords aus.
                            result=arrayIndex[pos];            //brauche nur noch i-wie d. Länge rauszufinden...
                        }

                        /*
                         */

                    }
                }
            }
        }
        else
            result=-1;

        return result;
    }
}//Ende Klasse FirstOccurnaceString1
