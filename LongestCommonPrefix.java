//18:23 // 18:37
public class LongestCommonPrefix {

    static int[] alphabets_counter = new int[26];
    static String[] stringArray;

    public static void main(String[] args) {
        stringArray= new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(stringArray));
    }//Ende Main


    public static String longestCommonPrefix(String[] strs) {
        String word, word1, word2, result="";
        char charWord;
        word=strs[0];
        word1=strs[1];
        word2=strs[2];


        for (char c : word.toCharArray()){
            alphabets_counter[c-'a']++;
        }
        for (char c : word1.toCharArray()){
            alphabets_counter[c-'a']--;
        }
        for (char c : word2.toCharArray()){
            alphabets_counter[c-'a']++;
        }

        for (int i=0; i<alphabets_counter.length;i++){
            if (alphabets_counter[i]>0){
                charWord= (char) alphabets_counter[i];
                result+=charWord;
            }
        }
        return result;
    }//Ende Method longestCommonPrefix
}//Ende Klasse
