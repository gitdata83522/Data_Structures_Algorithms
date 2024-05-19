//Write a function which will insert values in sorted order into linked list.
class Que5
{
    public static void main(String[]args)
    {
        List l = new List();
        l.insertSortedData(50);
        l.insertSortedData(20);
        l.insertSortedData(80);
        l.insertSortedData(30);
        l.insertSortedData(60);
        l.display();
    }
}

class List
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

    private Node head;
    public List()
    {
        head = null;
    }

    public Node getNode()
    {
        return head;
    }
    public boolean isEmpty()
    {
        return head == null;
    }

    public void addFirst(int data)
    { 
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data)
    {
        Node newnode = new Node(data);
        if(isEmpty())
            head = newnode;
        else
        {
            Node trav = head;
            while(trav.next != null)
                trav = trav.next;
            trav.next = newnode;
        }
    }

    public void deleteFirst()
    {
        if(isEmpty())
            return;
        else
            head = head.next;
    }

    public void deleteLast()
    {
        if(isEmpty())
            return;
        else if(head.next == null)
            head = null;
        else 
        {
            Node trav = head;
            while(trav.next.next != null)
                trav = trav.next;
            trav.next = null;
        }
    }
    public void addPosition(int data, int pos)
    {
        Node newnode = new Node(data);
        if(isEmpty())
            head = newnode;
        else if(pos <= 1)
            addFirst(data);
        else
        {
            Node trav = head;
            for(int i = 1;i<pos-1 && trav.next != null;i++)
                trav = trav.next;
            newnode.next = trav.next;
            trav.next = newnode;
        }
    }
    public void deletePosition(int pos)
    { 
        if(isEmpty())
            return;
        else if(pos <= 1)
            deleteFirst();
        else
        {
            Node trav = head;
            for(int i = 1;i<pos-1 && trav.next.next != null;i++)
                trav = trav.next;
            trav.next = trav.next.next;
        }
    }
    public void display()
    {
        Node trav = head;
        while(trav != null)
        {
                System.out.println(" "+trav.data);
                trav = trav.next;
        }

        System.out.println(" ");
    }

    public void insertSortedData(int data)
    {
        // create a node 
        Node newnode = new Node(data);
        // if list is empty  or if (head.data >= newnode.data)
        if(isEmpty() || head.data >= newnode.data)
        {
            newnode.next = head;
            head = newnode;
        }
        else
        {
            // create trav 
            Node trav = head;
            // traversal till last node 
            while(trav.next != null && trav.next.data < newnode.data)
                trav = trav.next;

            newnode.next = trav.next;
            trav.next = newnode;
        }
    }
    
}