package LinkedList;

public class mergeTwoListSortingThem {

    public static void main(String[] args) {
        listNode l1 = new listNode(10);
        l1.next = new listNode(7);
        l1.next.next = new listNode(100);
        l1.next.next.next = new listNode(500);

        listNode l2 = new listNode(3);
        l2.next = new listNode(40);
        l2.next.next = new listNode(5);
        l2.next.next.next= new listNode(50);

        
        listNode res =mergeTwoLists(l1,l2);
        printList(res);

    }

    private static void printList(listNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }

    private static listNode mergeTwoLists(listNode l1, listNode l2)
    {
        listNode dummy = new listNode(0);
        listNode current = dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1 != null)
        {
            current.next=l1;
        }else if(l2!=null)
        {
            current.next=l2;
        }
        return dummy.next;
    }

}