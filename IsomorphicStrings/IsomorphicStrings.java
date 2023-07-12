package Training2.IsomorphicStrings;
//13:04 - 13:19

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s, t;

        s="egg";
        t="add";

        IsomorphicStrings iS1= new IsomorphicStrings();

        // 65- 122


        System.out.println(iS1.isIsomorphic(s,t));

    }//Ende Methode Main

    public boolean isIsomorphic(String s, String t) {
        boolean truth=false;
        char c;
        int asciiNR;
        String result="";

        char [] charArrayS = s.toCharArray();
        //char [] charArrayT = t.toCharArray();
        char [] compareArray = new char[s.length()];


         for(int i=0; i<charArrayS.length;i++){
             c=charArrayS[i];
             asciiNR=(int) c+1;
             //compareArray[i]=(char)asciiNR;
             result=result+(char)asciiNR;
        }


        //System.out.println("Result: " + result);

        if(result.equals(t)){
            truth=true;
        }
        else
            truth=false;

        return truth;
    }//Ende Methode isIsomorphic


}//Ende Klasse IsomorphicStrings
