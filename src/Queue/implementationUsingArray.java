package Queue;

public class implementationUsingArray {

    int front, rear, capacity;
    int[] queue;

    implementationUsingArray(int c)
    {
        front=0;
        rear=-1;
        this.capacity=c;
        queue = new int[c];
    }
    private void enqueue(int n)
    {
        if(rear == capacity-1)
        {
            System.out.println("the queue is full.");
            return;
        }
        queue[++rear]=n;
    }

    private void display()
    {
        if(front>rear)
        {
            System.out.println("Queue is empty!");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i]+", ");
        }
    }
    private void dequeue()
    {
        if(front>rear)
        {
            System.out.println("the queue is empty!");
        }
        for(int i=0;i<rear;i++)
        {
            queue[i]=queue[i+1];
        }
        rear--;
    }
    void front()
    {
        if(front>rear)
        {
            System.out.println("queue is empty!");
            return;
        }
        System.out.println("the front element is :"+ queue[front]);
    }

    public static void main(String[] args) 
    {
        implementationUsingArray q = new implementationUsingArray(4);
        q.enqueue(10);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(12);
        q.display();
        System.out.println();
        q.dequeue();
        q.display();
        q.front();
        
    }

}
