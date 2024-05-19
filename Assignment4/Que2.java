//2. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//all operations.

class Que2
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addLast(50);
        l.addLast(60);
       // l.addAtPosition(100,0);
        l.display();
        l.deleteFirst();
        l.deleteLast();

        l.deletePosition(2);
        l.display();
    }
}
class LinkedList
{
    static class Node
    {
        private int data;
        private Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    private Node tail;

    public LinkedList()
    {
        tail = null;
    }

    public boolean isEmpty()
    {
        return tail == null;
    }

    public void addFirst(int data)
    {
        Node newnode = new Node(data);
        if(isEmpty())
        {
            tail = newnode;

            newnode.next = newnode;
        }
        else
        {
            newnode.next = tail;
           
            Node trav = tail;

            while(trav.next != tail)
                trav = trav.next;
            trav.next = newnode;   

            tail = newnode;
        }
    }

    public void addLast(int data)
    {
        Node newnode = new Node(data);

        if(isEmpty())
        {
            tail = newnode;

            newnode.next = newnode;
        }
        
        else 
        {
            
            newnode.next = tail;
            
            Node trav = tail;

            while(trav.next != tail)
            {
                trav = trav.next;
            }

            trav.next = newnode;
        }
    }

    public void addAtPosition(int data,int pos)
    {
         Node newnode = new Node(data);

        if(pos < 1)
        {
            System.out.println("Invalid position");
            return;
        }
        else
        {
            if(isEmpty())
            {
                tail = newnode;
               
                newnode.next = newnode;
            }
            else
            {
                Node trav = tail;
            
                for(int i =1;i<pos-1;i++)
                {
                    trav = trav.next;
                }

                newnode.next = trav.next;

                trav.next = newnode;
            }
        }
    }

    public void deleteFirst()
    {
        if(isEmpty())
            return;
        else if(tail.next == tail)
            tail = null;
        else 
        {
            Node trav = tail;
            for(trav = tail; trav.next != tail; trav = trav.next)
                trav.next = tail.next;
                tail = tail.next;
        }
    }

    public void deleteLast()
    {
        if(isEmpty())
            return;
        if(tail.next == tail)
        {
            tail = null;
        } 
        else
        {
            Node trav = tail;
            while(trav.next.next != null)
                trav = trav.next;
            
            trav.next = tail;
        }
    }

    public void deletePosition(int pos)
    {
       if(pos < 1)
       {
        System.out.println("Invalid position");
        return;
       }
       else
       {
        if(isEmpty())
            return; 
        else if(tail.next == tail)
        {
            tail = null;
        }
        else
        {
            Node trav = tail;
            for(int i = 1;i<pos-1;i++)
                trav = trav.next;
            trav.next = trav.next.next;
        }
       }
    }
    public void display()
    { 
        if(isEmpty())
            return;  
        Node trav = tail;
        System.out.println("List : ");
        do
        {
            System.out.println(" "+trav.data);

            trav = trav.next;
        }while(trav != tail); 
    }

}