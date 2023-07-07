package Training2.RemoveLinkedListElements;


//Duration: 21 Minutes....

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


Example 1:

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:


Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []


Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        //LinkedList<Integer> head = new LinkedList<>(List.of(1,2,6,3,4,5,6));
        LinkedList<Integer> head = new LinkedList<>(List.of(7,7,7,7));
        int val;

        val=7;

        RemoveLinkedListElements r1 = new RemoveLinkedListElements();
        LinkedList<Integer> output = r1.removeElements(head, val);


        for (int i=0; i<output.size();i++){
            System.out.println(output.get(i));
        }

    }//Ende Methode Main


    /*
    a) suche Element mit Index.
    b) entferne es.
    c) gib es aus...
     */
    public LinkedList removeElements(LinkedList head, int val){
        int searchedIndex, nr;
        LinkedList<Integer> output = new LinkedList<>();

        while (head.contains(val)){
            //a)
            searchedIndex=head.indexOf(val);
            //b
            head.remove(searchedIndex);
        }

        //c
        for (int i=0; i<head.size();i++){
            nr= (int) head.get(i);
            output.add(nr);
        }

        return output;
    }//Ende Methode removeElements


}//Ende Klasse RemoveLinkedListElements
