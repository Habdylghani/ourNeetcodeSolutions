public class ReversedLinkedList {

    public static ListNode reverseList(ListNode head) {
        // ListNode prev=null;
        // ListNode current = head;
        // while(current!=null){
        // ListNode reserveCurrent=current.next;
        // current.next=prev;
        // prev=current;
        // current=reserveCurrent;
        // }
        // return prev;

        ListNode exeptfirst = head;
        if (head == null) {
            return null;
        }
        if (head.next != null) {
            exeptfirst = reverseList(head.next);
            head.next.next = head;
            //
        }
        head.next = null;

        return exeptfirst;
    }

    public static void main(String[] args) {
        ListNode h=new ListNode(5);
        ListNode he=new ListNode(4,h);
        ListNode hea=new ListNode(3,he);
        ListNode head=new ListNode(2,hea);
        //reverseList(head);
        System.out.println(reverseList(head)); 
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        return String.valueOf(this.val)+"-->"+String.valueOf(this.next);
    }
}
