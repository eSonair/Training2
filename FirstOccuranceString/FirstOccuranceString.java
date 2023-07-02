package FirstOccuranceString;

public class FirstOccuranceString {
    public static void main(String[] args) {
        String haystack, needle;
        int [] alphabetCounter = new int [26];

        FirstOccuranceString s= new FirstOccuranceString();

        haystack="sadbutsad";
        needle = "sad";



        s.strStr(alphabetCounter,haystack,needle);

    }//Ende Methode Main

    public int strStr(int [] alphabetCounter, String haystack, String needle) {
        int index=0, counter=0;
        String result="";

        char[] charArray = haystack.toCharArray();
        char[] charArray1 = needle.toCharArray();
        char [] arrayIndex = new char [charArray.length];


        //Suche needle als Buchstabe.
        for (char c : charArray1){
            //if(alphabetCounter[i])
            alphabetCounter[c-'a']++;
        }

        /*

        //target sucht im goal! //charrArray1=3!
        for (int i=0; i<charArray.length;i++){
            for (int j=0; j<charArray1.length; j++){
                //d. ersten 3 letters v. goal!
                result.concat(""+charArray[j]);
            }
            if(!result.equals(needle)){
               for(int x=0; x<result.length();x++){
                   result=result.replace(0)
               }
            }
        }



          for (char c :charArray){
            alphabetCounter[c-'a']++;
        }


        for (int i=0; i<alphabetCounter.length; i++){
            if(alphabetCounter[i]>0){
                counter++;                                  //Anzahl d. Buchstaben, welche wirklich existieren werden abgespeichert.
            }
        }

        //All ANSI Zahlen in Buchstaben zurück verwandeln
        for(int i=0; i<alphabetCounter.length;i++){
            for (int j=0; j<arrayIndex.length; j++){
                if(alphabetCounter[i]>0){
                    arrayIndex[j]=(char) (i+97);
                }
            }
        }

        /*
         for(char a:arrayIndex){
            System.out.println(a);
        }


        for(int i=0; i<alphabetCounter.length; i++){
           if (alphabetCounter[i]>0){
               System.out.println("Index: " +i + " + Inhalt: " + alphabetCounter[i]);
           }
        }

         */
        return index;
    }


    /*
    public void findWordPosition (int counter, char [] charArray){
        for (int i=0; i<charArray.length; i=+counter{
            for(int j=0; j<counter; j++){
                if(charArray[j]==)
            }
        }
    }// Ende Methode findWordPosition
     */


}//Ende Klasse
