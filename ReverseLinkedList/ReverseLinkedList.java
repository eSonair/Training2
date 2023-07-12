package Training2.ReverseLinkedList;

public class ReverseLinkedList <T> {

    ListNode root;


    ReverseLinkedList(T... elements) {
        root=new ListNode(elements[0]);
        ListNode current=root;
        ListNode temp;
        for(int i=1;i<elements.length;i++) {
            temp=new ListNode(elements[i]);
            current.next=temp;
            current=current.next;
        }
    }//Ende Methode List



    public static void main(String[] args) {
        ListNode current;
        ReverseLinkedList<Integer> reverseList = new ReverseLinkedList<>(1, 2, 8);

        reverseList.print();

    }//Ende Methode Main




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
