public class Main {
    //14:45 // 14:57 // 15:09

    public static void main(String[] args) {
        boolean truth=false;
        System.out.println( canConstruct("ransomNote", "magazine"));
       // from ransomeNote to magazine
    }//Ende Main

    public static boolean canConstruct(String word, String word1) {

        if (word.length() > word1.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : word1.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : word.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;


        /*
         boolean truth=false;
       int counter=0;
       char [] wordArray = new char[word.length()];
       char [] wordArray1 = new char[word1.length()];

       //Array1
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
        }

        //Array2
        for (int i = 0; i < word.length(); i++) {
            wordArray1[i] = word1.charAt(i);
        }


        System.out.println("Das Array enthält folgende Buchstaben:");
        for (char c : wordArray) {
            System.out.println(c);
        }
         //return truth;
        */


    }//End Method

}//Ende Klasse
