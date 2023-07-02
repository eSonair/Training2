//8:58 //9:21 // hab zu viel Zeit verschissen, weil ich vergessen hab d. mergedList zu instanzieren...



import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static LinkedList<Integer>list1;
    public static LinkedList<Integer>list2;
    public static LinkedList<Integer>mergedList;

    public static void main(String[] args) {
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();
        mergedList = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);


        mergedList();

    }//Ende Main

    public static void mergedList(){

        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);

        for (int a:mergedList){
            System.out.println(a);
        }
    }//End Method merge

}//Ende Klasse
