package Training2.IsomorphicStrings;

//19:14 - 19:40  // 12:39 - 12:01?


import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        /*String s="badc";
        String t="baba";*/          //wrong

        String s="paper";
        String t="title";

        IsomorphicStrings iS1 = new IsomorphicStrings();

        System.out.println(iS1.isIsomorphic(s,t));


    }//Ende Methode Main

    public boolean isIsomorphic(String s, String t) {
        boolean truth=false;

        HashMap <Character, Character> hashMap = new HashMap<>();
        char [] sCharArray=s.toCharArray();
        char [] tCharArray=t.toCharArray();
        char c;

        for (int i=0; i<s.length();i++){
            if(hashMap.containsKey(sCharArray[i])){
                c=hashMap.get(sCharArray[i]);
                if(c!=tCharArray[i]){
                    return truth;
                }
            } else
                hashMap.put(sCharArray[i],tCharArray[i]);


            if(hashMap.containsKey(tCharArray[i])){
                c=hashMap.get(tCharArray[i]);
                if(c!=sCharArray[i]){
                    return truth;
                }
            }else
                hashMap.put(sCharArray[i],tCharArray[i]);

            //      String t="title";
            //      String s="paper";
        }//Ende for - Schleife

        truth=true;
        return truth;
    }//Ende Methode isIsomorphic

}//Ende Klasse IsomorphicStrings
