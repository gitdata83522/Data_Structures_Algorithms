import java.util.Scanner;
class Stack
{
    private int arr[];
    private final int size;
    private int top;

    public Stack(int size)
    {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element)
    {
        // increment the top 
        top++;
        // insert an element at the top index 
        arr[top] = element;
    }

    public int pop()
    {
        // decrement the top value 
        return arr[top--];
    }

    public int peek()
    {
        // return the element at the top index
        return arr[top];
    }

    public void display()
    {
        for(int i = 0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void reverseDisplay()
    {
        for(int i = top;i>= 0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size-1;
    }
}

class StackMain
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();
        Stack s = new Stack(size);

        do
        {
            System.out.println("0:EXIT\n1:PUSH\n2:POP\n3:PEEK\n4:DISPLAY\n5:REVERSE DISPLAY");
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 0: 
                    System.out.println("Thank you for using stack !!");
                    break;
                case 1:
                    if(s.isFull())
                        System.out.println("Stack is Overflow !!");
                    else
                    {
                        System.out.println("Enter the element : ");
                        int element = sc.nextInt();
                        s.push(element);
                        System.out.println("Pushed Element is : "+element);
                    }

                    break;

                case 2:
                    if(s.isEmpty())
                        System.out.println("Stack is Underflow !!");
                    else
                        System.out.println("Popped Element is : "+s.pop());

                    break;

                case 3:
                    if(s.isEmpty())
                        System.out.println("Stack is Underflow !!");
                    else
                        System.out.println("Topmost Element is : "+s.peek());

                    break;

                case 4:
                    if(s.isEmpty())
                        System.out.println("Stack is Underflow !!");
                    else
                        s.display();

                    break;
                
                case 5:
                    if(s.isEmpty())
                        System.out.println("Stack is Underflow !!");
                    else
                        s.reverseDisplay();
                    
                    break;
                default:
                    System.out.println("Invalid choice !! Enter a valid choice ");
                    break;
            }
        }while(choice != 0);
    }
}