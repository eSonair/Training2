package Training2.ReverseLinkedList;

public class ReverseLinkedList <T> {

    ListNode root;




    public static void main(String[] args) {
        ListNode current;
        ReverseLinkedList<Integer> reverseList = new ReverseLinkedList<Integer>(1, 2, 8);

        reverseList.print();

    }//Ende Methode Main


    ReverseLinkedList(T... elements) {
        root=new ListNode((Integer) elements[0]);
        ListNode current=root;
        ListNode temp;
        for(int i=1;i<elements.length;i++) {
            temp=new ListNode((Integer) elements[i]);
            current.next=temp;
            current=current.next;
        }
    }//Ende Methode List



    public void print()
    {
        System.out.println("Print: " );
        ListNode current = this.root;
        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }


    }//Ende Methode print



}//Ende Klasse ReverseLinkedList
