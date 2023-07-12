package Training2.ListNode;

import Training2.ListNode.ListNode;

public class List<T> {
    ListNode root;

    List(T... elements) {
        root=new ListNode( elements[0]);
        ListNode current=root;
        ListNode temp;
        for(int i=1;i<elements.length;i++) {
            temp=new ListNode((Integer) elements[i]);
            current.next=temp;
            current=current.next;
        }
    }

    void print() {
        System.out.println("PRINT:");
        ListNode current = this.root;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
