package Training2.ExcelSheetColumnNumber;

//https://leetcode.com/problems/excel-sheet-column-number/description/
//16:10


public class ExcelSheetColumnNumber2 {

    public static void main(String[] args) {

        ExcelSheetColumnNumber2 eX = new ExcelSheetColumnNumber2();

        //A=65
        //Z=90

        String string="ZY";


        System.out.println(eX.titleToNumber(string));

    }//Ende Methode Main

    public int titleToNumber(String columnTitle) {

        int result=0;
        char [] c1 = new char[7];
        c1=columnTitle.toCharArray();


        for(int i=0;i<columnTitle.length();i++)
        {
            result*=26;
            result+=c1[i]-'A'+1;
        }
        return result;

    }//Ende Methode titleToNumber

}//Ende Klasse ExcelSheetColumnNumber
