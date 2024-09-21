package LinkedList;

public class revListAndAddNumbers {

    public static void main(String[] args) {
        LinkedListNode list1 = new LinkedListNode(2);
        list1.next = new LinkedListNode(4);
        list1.next.next = new LinkedListNode(3);
        LinkedListNode list2 = new LinkedListNode(5);
        list2.next = new LinkedListNode(6);
        list2.next.next = new LinkedListNode(4);
        //Printing the list
        System.out.println("First list: ");
        printList(list1);
        System.out.println("Second list: ");
        printList(list2);
        //Reversing the list
        LinkedListNode rev1 = reverseList(list1);
        System.out.println("First reversed linked list");
        printList(rev1);
        LinkedListNode rev2 = reverseList(list2);
        System.out.println("Second reversed linked list");
        printList(rev2);
        //Adding the two linkedList
        LinkedListNode sumHead = addTwoLinkedLists(rev1,rev2);
        System.out.println("the sum linked list is :");
        printList(sumHead);

    }
    private static LinkedListNode addTwoLinkedLists(LinkedListNode head1, LinkedListNode head2)
    {
        LinkedListNode current = new LinkedListNode(-1);
        LinkedListNode dummy = current;
        int carry = 0;
        while(head1 !=null || head2!=null)
        {
            int sum = carry;
            if(head1!=null)
            {
                sum+=head1.val;
                head1=head1.next;
            }
            if(head2!=null)
            {
                sum+=head2.val;
                head2=head2.next;
            }
            carry = sum/10;
            dummy.next = new LinkedListNode(sum%10);
            dummy=dummy.next;
        }
        if(carry>0)
        {
            dummy= new LinkedListNode(carry);
        }
        return current.next;
    }
    private static void printList(LinkedListNode node)
    {
        LinkedListNode head = node;
        while(head!=null)
        {
            System.out.print(head.val + ", ");
            head = head.next;
        }
        System.out.println();
    }
    private static LinkedListNode reverseList(LinkedListNode head)
    {
        LinkedListNode prev = null;
        LinkedListNode current = head;
        while(current != null)
        {
            LinkedListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
