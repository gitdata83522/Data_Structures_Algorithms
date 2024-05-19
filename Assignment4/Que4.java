import java.util.Scanner;
class Que4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        int choice;
        do
        {
            
            System.out.println("\n0:Exit\n1:AddFirst\n2:AddLast\n3:AddAtPosition\n4:DeleteFirst\n5:DeleteLast\n6:DeleteAtPosition\n7:DisplayList\n8:ReverseDisplay");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            int data;
            int pos;
            switch(choice)
            {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Enter the data to be added : ");
                    data = sc.nextInt();
                    l.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter the data to be added : ");
                    data = sc.nextInt();
                    l.addLast(data);
                    break;
                case 3:
                    System.out.println("Enter the data to be added : ");
                    data = sc.nextInt();
                    System.out.println("Enter the position : ");
                    pos = sc.nextInt();
                    l.addAtPosition(data,pos);
                    break;
                case 4:
                    l.deleteFirst();
                    break;
                case 5:
                    l.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter the position : ");
                    pos = sc.nextInt();
                    l.deleteAtPosition(pos);
                    break;
                case 7:
                    l.reverseDisplay(l.getNode());
                    break;
                case 8:
                    l.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 0);
        // LinkedList l = new LinkedList();
        // l.addFirst(10);
        // l.addFirst(20);
        // l.addFirst(30);
        // l.addFirst(40);
        // l.addLast(50);
        // l.addLast(60);
        // l.display();
        // l.deleteFirst();
        // l.deleteLast();

        // l.addAtPosition(100,0);
        // l.addAtPosition(200,8);

        // l.deleteAtPosition(8);
        // l.deleteAtPosition(0);
        // l.display();
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
    private Node head;
    private Node tail;

    public LinkedList()
    {
        head = null;
        tail = null;
    }

    public boolean isEmpty()
    {
        return head == null && tail == null;
    }

    public Node getNode()
    {
        return head;
    }

    public void addFirst(int element)
    {
        // create a new node 
        Node newnode = new Node(element);
        // add head into next of node 
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int element)
    {
        // create a new node 
        Node newnode = new Node(element);
        // if list is empty 
        if(isEmpty())
            tail = newnode;
        // if list is not empty
        else
        {
            // create a new node 
            Node trav = head;
            while(trav.next!= null)
                trav = trav.next;
            trav.next= newnode;
            tail = newnode;
        }
    }

    public void deleteFirst()
    {
        // if list is empty 
        if(isEmpty())
            System.out.println("List is empty");
        // if list is not empty
        else
        {
            // create a new node 
            head = head.next;
        }
    }

    public void deleteLast()
    {
        // if list empty 
        if(isEmpty())
            System.out.println("List is empty");
        // if list is not empty
        else
        {
            // create a new node 
            Node trav = head;
            while(trav.next.next!= null)
                trav = trav.next;
            trav.next = null;
            tail = trav;
        }
    }

    public void addAtPosition(int element,int pos)
    {
        // if list is empty
        Node newnode = new Node(element);
        if(isEmpty())
            // add newnode into head itself 
            head = newnode;
        
        else if(pos <=1)
            addFirst(element);
        
        else
        {
            Node trav = head;
            // traverse the data till pos-1 node 
            for(int i =1;i<pos-1 && trav.next != null;i++)
                trav = trav.next;

            // add pos of node into next of newnode 
            newnode.next = trav.next;

            // add newnode into next of pos-1  node 
            trav.next = newnode;
        }

    }

    public void deleteAtPosition(int pos)
    {
        // if list is empty 
        if(isEmpty())
            return;
        // if list contains only one node 
        else if(pos <= 1)
            deleteFirst();
        // if list contains more than one node
        else
        {
            Node trav = head;
            // traverse the data till pos-1 node 
            for(int i = 1;i<pos-1 && trav.next.next != null;i++)
                trav = trav.next;
            
            // add pos+1 node into next of pos-1 node 
            trav.next = trav.next.next;
        }
    }

    public void display()
    {
        // create trav refernce 
        Node trav = head;

        while(trav != null)
        {
            // print current node 
            System.out.print("  "+trav.data);

            // go to next node 
            trav = trav.next;
        }
        System.out.println();
    }

    public void reverseDisplay(Node trav)
    {
        if(trav == null)
            return;
        reverseDisplay(trav.next);
        System.out.print(" "+trav.data);
    }
}