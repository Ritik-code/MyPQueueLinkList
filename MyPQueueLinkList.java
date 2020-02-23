package stark;


class Node5
{
    int data;
    int priority;
    Node5 next;

    public Node5(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
public class MyPQueueLinkList {
    Node5 front;
    Node5 rear;

    public MyPQueueLinkList() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(Node5 newnode)
    {
        if(front == null || newnode.priority < front.priority)
        {
            newnode.next = front;
            front = newnode;
            System.out.println("Node Inserted.");
        }
        else
        {
            Node5 temp = front;
            while(temp.next!=null && temp.next.priority <= newnode.priority)
            {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            System.out.println("Node Inserted.");
        }
    }
    public void dequeue()
    {
        if(front == null)
        {
            System.out.println("Queue Underflow.");
        }
        else
        {
            Node5 temp = front;
            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            System.out.println(temp.next.data+" Node Deleted.");
            temp.next = null;
        }
    }
    public void traverse()
    {
        if(front == null)
        {
            System.out.println("Queue Underflow.");
        }
        else
        {
            Node5 temp = front;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

class MyPQueueLinkListMain
{
    public static void main(String[] args) {
        Node5 n1 = new Node5(10,1);
        Node5 n2 = new Node5(20,2);
        Node5 n3 = new Node5(30,3);
        Node5 n4 = new Node5(40,4);
        Node5 n5 = new Node5(50,5);
        MyPQueueLinkList obj = new MyPQueueLinkList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
        obj.enqueue(n5);
        obj.traverse();
        obj.dequeue();
        obj.traverse();
        obj.dequeue();
        obj.traverse();
    }
}

