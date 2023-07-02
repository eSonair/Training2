package PascalTriangle_Pkg;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args) {
        PascalTriangle2 s = new PascalTriangle2();
        System.out.println(s.getRow(3));
    }//Ende Main

    public List<Integer> getRow(int rowIndex) {
        // Initialize the row with 1s
        List<Integer> row = new ArrayList<>(rowIndex + 1);

        // Calculate each element of the row based on the previous row
        for (int i = 0; i <= rowIndex; ++i) {       //i++ ist in einer for-Schleife wie ++i;
            row.add(1);
            for (int j = i - 1; j > 0; --j) {       //Z4; j=3-1=2; 
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }//Ende Methode getRow

}//Ende Klasse
