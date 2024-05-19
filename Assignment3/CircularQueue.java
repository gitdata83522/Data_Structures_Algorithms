import java.util.Scanner;
class Queue
{
    private int arr[];
    private final int size;
    private int front;
    private int rear;
    private int count;

    public Queue(int size)
    {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        count = 0;
    }

    public void push(int element)
    {
        // increment the value of rear  --> using formula 
        rear = (rear + 1)%size;
        // insert an element at the rear index 
        arr[rear] = element;
        // increments the count
        count++;
    }
    public void pop()
    {
        // increment the value of front --> using formula 
        front = (front + 1)%size;
        count--;
        System.out.println("Popped element is : "+arr[front]);
        if(front == rear)
            front = rear = -1;
    }

    public int peek()
    {
        // return the element at the front index
        return arr[(front + 1)%size];
    }

    public boolean isEmpty()
    {
        // here empty of queue condition is check 
        if(front == -1 && front == rear)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        // here we check for two comparisons 
        if((front == -1 && rear == size -1) || (front != -1 && front == rear))
            return true;
        else
            return false;
    }

    public void display()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public int counter()
    {
        return count;
    }
}

class CircularQueue
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        do
        {
            System.out.println("O:EXIT\n1:PUSH\n2:POP\n3:PEEK\n4:DISPLAY\n5:COUNTER");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.out.println("Thank you for using Circular Queue !!");
                    break;
                case 1:
                   if(q.isFull())
                     System.out.println("Queue is Overflow !!");
                   else
                   {
                    System.out.println("Enter a element : ");
                    int element = sc.nextInt();
                    q.push(element);
                    System.out.println("Pushed Element is : "+element);
                   }
                    break;

                case 2:
                    if(q.isEmpty())
                        System.out.println("Queue is Underflow!!");
                    else
                        q.pop();
                    
                    break;
                
                case 3:
                    if(q.isEmpty())
                        System.out.println("Queue is Underflow!!");
                    else
                        System.out.println("Peek element is : "+q.peek());
                    break;

                case 4:
                    if(q.isFull())
                        System.out.println("Queue is Underflow !!");
                    else
                        q.display();

                    break;

                case 5:
                    if(q.isEmpty())
                        System.out.println("Queue is Underflow !!");
                    else
                        System.out.println("Total Count : "+q.counter());
                    
                    break;

                default :
                    System.out.println("Invalid choice !! Enter a valid choice ");
                    break;
            }
        }while(choice != 0);
    }
}