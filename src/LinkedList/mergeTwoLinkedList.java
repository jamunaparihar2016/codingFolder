package LinkedList;

public class mergeTwoLinkedList {

    public static void main(String[] args) {
        listNode l1= new listNode(1);
        l1.next = new listNode(10);
        l1.next.next = new listNode(5);
        l1.next.next.next = new listNode(6);

        listNode l2= new listNode(5);
        l2.next = new listNode(4);
        l2.next.next = new listNode(7);
        l2.next.next.next = new listNode(5);

        listNode res = mergeTwoLinkedLists(l1,l2);
        printList(res);
    }
    private static listNode mergeTwoLinkedLists(listNode l1, listNode l2)
    {   
        if(l1==null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        }
        listNode current = l1;
        while(current.next!=null)
        {
            current=current.next;
        }
        //Attach the second list to the end of the first list
        current.next=l2;
        return l1;
    }

    public static void printList(listNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
}
    /*
     *   ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        
        // Attach the second list to the end of the first list
        current.next = l2;
        
        return l1; // Return the merged list
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
     */