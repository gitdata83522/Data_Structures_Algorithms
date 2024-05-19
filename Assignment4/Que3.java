// 3. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a
//new node before a given node

class Que3
{
    public static void main(String[]args)
    {
        List l = new List();
        l.addFirst(20);
        l.addFirst(50);
        l.addFirst(60);
        l.addFirst(70);
        l.insertNewNodeAfter(l.getNode(),30);
        l.insertNewNodeBefore(l.getNode(),10);
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

    public void insertNewNodeAfter(Node prev,int data)
    {
        // check prevnode is null or not 
        if(prev == null)
        {
            System.out.println("The given node is null !!");
            return;
        }
        // create a node 
        Node newnode = new Node(data);
        // add prev node into next of newnode 
        newnode.next = prev.next;
        // add newnode into the next of prev
        prev.next = newnode;
    }
    
    public void insertNewNodeBefore(Node newnode,int data)
    {
        // check head is null or not 
        if(head == null)
        {
            System.out.println("The list is empty !!");
            return;
        }

        // head is empty or not 
        if(head == newnode)
        {
            addFirst(data);
            return;
        }
        // create a node 
        newnode = new Node(data);
        // create a trav 
        Node trav = head;
        // search traversal till last node 
        while(trav != null && trav.next != newnode)
            trav = trav.next;
        // if traversal is null or not 
        if(trav == null)
        {
            System.out.println("The given node is not present in the list !!");
            return;
        }
        newnode.next = trav.next;
        trav.next = newnode;
    }
}