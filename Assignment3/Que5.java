import java.util.Scanner;
class Que5
{
    public static int postFixEvaluation(String postfix)
    {
        Stack s = new Stack(50);
        for(int i = 0;i < postfix.length();i++)
        {
            char ele = postfix.charAt(i);

            if(Character.isDigit(ele))
                s.push(ele - '0');

            else
            {
                int op2 = s.pop();
                int op1 = s.pop();
                int result = 0;

                switch(ele)
                {
                    case '+':
                        result = op1 + op2;
                        break;
                    case '-':
                        result = op1-op2;
                        break;
                    case '*':
                        result = op1*op2;
                        break;
                    case '/':
                        result = op1/op2;
                        break;
                    case '%':
                        result = op1%op2;
                        break;
                    case '^':
                        result =  op1^op2;
                        break;
                }
                s.push(result);
            }
        }
        if(!s.isEmpty())
            return s.peek();
        return 0;
    }

    public static int prefixEvaluation(String prefix)
    {
        Stack s  = new Stack(50);

        for(int i = prefix.length() -1;i>= 0;i--)
        {
            char ele = prefix.charAt(i);

            if(Character.isDigit(ele))
            {
                s.push(ele - '0');
            }

            else
            {
                int op1 = s.pop();
                int op2 = s.pop();
                int result = 0;

                switch(ele)
                {
                    case '+':
                        result = op1 + op2;
                        break;
                    case '-':
                        result = op1-op2;
                        break;
                    case '*':
                        result = op1*op2;
                        break;
                    case '/':
                        result = op1/op2;
                        break;
                    case '%':
                        result = op1%op2;
                        break;
                    case '^':
                        result =  op1^op2;
                        break;
                }
                s.push(result);
            }
        }
        if(!s.isEmpty())
            return s.peek();
        return 0;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("0: Exit\n1:Postfix Evaluation\n2:Prefix Evaluation");
        System.out.println("Enter the which type to be perform : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 0:
                System.out.println("Thank you for using Evaluation !!");
                break;
            
            case 1:
                System.out.println("Enter the Postfix string : ");
                String postfix = sc.next();
                //String postfix = "456*3/+9+7-";
                System.out.println("Postfix Expression : "+postfix);
                int result = postFixEvaluation(postfix);
                System.out.println("Result for Postfix : "+result);
                break;

            case 2:
                System.out.println("Enter the Prefix string : ");
                String prefix = sc.next();
                //String prefix = "-++4/*56397";
                System.out.println("Prefix Expression : "+prefix);
                int result1 = prefixEvaluation(prefix);
                System.out.println("Result : "+result1);
                break;

            default:
                System.out.println("Invalid choice !! Enter a valid choice : ");
                break;
        }
    }
}


class Stack 
{
    private final int size;
    private int arr[];
    private int top;

    public Stack(int size)
    {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size - 1;
    }

    public void push(int element)
    {
        // increment the top value 
        top++;
        // assign the value 
        arr[top] = element;
    }

    public int pop()
    {
        // decrement the top ;
        // return the arr of top element 
        return arr[top--];
    }

    public int peek()
    {
        return arr[top];
    }
}