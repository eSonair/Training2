package FirstOccuranceString;

public class FirstOccuranceString2 {
    public static void main(String[] args) {
        String haystack, needle;
        int index;

        FirstOccuranceString2 s= new FirstOccuranceString2();

        haystack="leetcode";   //satbsadtz
        needle = "leeto";      //sad

        index=s.strStr(haystack,needle);

        if (index != -1) {
            System.out.println("Der Buchstabe '" + needle + "' wurde an Position " + index + " gefunden.");
        } else {
            System.out.println("Der Buchstabe '" + needle + "' wurde nicht in der Zeichenkette gefunden.");
        }


    }//Ende Methode Main

    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }


}///Ende Klasse FirstOccurance String2
