package Training2.ReverseLinkedList;
// 2 weeks....


public class ReverseLinkedList <T> {

    ListNode previous;


    public static void main(String[] args) {
        ReverseLinkedList<Integer> reverseList = new ReverseLinkedList<Integer>(1, 2, 8);

        reverseList.print();

    }//Ende Methode Main


    ReverseLinkedList(T... elements) {
        previous=new ListNode((Integer) elements[elements.length-1]);
        ListNode current=previous;
        ListNode temp;
        for(int i=elements.length-2;i>=0;i--) {
            temp=new ListNode((Integer) elements[i]);
            current.previous=temp;
            current=current.previous;
        }
    }//Ende Methode ReverseLinkedList


    public void print()
    {
        System.out.println("Print: " );
        ListNode current = this.previous;

        while(current!=null){
            System.out.println(current.val);
            current = current.previous;
        }
    }//Ende Methode print



}//Ende Klasse ReverseLinkedList
