package LinkedList;

public class sumOfTwoLinkedList {

    public static void main(String[] args) {
        LinkedListNode list1 = new LinkedListNode(10);
        list1.next = new LinkedListNode(2);
        list1.next.next = new LinkedListNode(4);
        printList(list1);
        LinkedListNode list2 = new LinkedListNode(10);
        list2.next = new LinkedListNode(2);
        list2.next.next = new LinkedListNode(4);
        printList(list2);
        // findSum(list1,list2);
        printList(findSum(list1, list2));
    }
    private static void printList(LinkedListNode node)
    {
        LinkedListNode node2 = node;
        while(node2!=null)
        {
            System.out.print(node2.val+", ");
            node2=node2.next;
        }
        System.out.println();
    }
    private static LinkedListNode findSum(LinkedListNode node1, LinkedListNode node2)
    {
        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode node3 = dummy;
        while(node1!=null & node2!=null)
        {
            int sum= node1.val+ node2.val;
            node3.next= new LinkedListNode(sum);
            node3=node3.next; 
            node1 = node1.next;
            node2 = node2.next;     
        }
        return dummy.next;
    }

}
