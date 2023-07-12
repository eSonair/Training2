public class List<T> {
    ListNode root;

    List(T... elements) {

        // TODO
        /*ListNode lN = new ListNode(elements[0]);
        this.root =lN;

        for (int i=1; i<elements.length;i++){
            if(i<elements.length-1){

                ListNode name = new ListNode(elements[i]);
                name.next=new ListNode(elements[i+1]);
            }
            else{
                ListNode name = new ListNode(elements[i]);
            }

        }*/
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
