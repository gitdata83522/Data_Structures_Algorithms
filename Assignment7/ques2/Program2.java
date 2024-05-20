package assignment7.ques2;

public class Program2 {

    public static void main(String args[])
    {
        Queue q = new Queue(10);
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("Topmost element : "+q.peek());
        System.out.println("Deleted element : "+q.poll());
        
    }
}

class Queue
{
    Heap h;
    public Queue(int size)
    {
        h = new Heap(size);
    }

    public void offer(int data)
    {
        h.addHeap(data);
    }

    public int poll()
    {
        return h.deleteHeap();
    }

    public int peek()
    {
        return h.getHeap();
    }


}
class Heap {
    private int size;
    private int SIZE;
    private int arr[];
    public Heap(int SIZE)
    {
        this.SIZE = SIZE;
        arr = new int [SIZE+ 1];
        size = 0;
    }

    public void addHeap(int data)
    {
        if(size >= SIZE)
            System.out.println("Heap is Full !!");
        size++;
        arr[size] = data;
        int ci  = size;
        int pi = ci / 2;
        while (pi >= 1) {
            if(arr[pi] < arr[ci])
                break;
            int temp = arr[pi];
            arr[pi] = arr[ci];
            arr[ci] = temp;

            ci = pi;
            pi = ci / 2;
        }
    }

    public int deleteHeap()
    {
        if(size == 0)
            System.out.println("Heap is Empty !!");
        int min = arr[1];
        arr[1] = arr[size];
        arr[size] = min;
        size--;
        int pi = 1;
        int ci = pi*2;
        while (ci <=size) {
            if(ci + 1 <= size && arr[ci + 1] < arr[ci])
                ci = ci+1;
            if(arr[pi] <= arr[ci])
                break;
            int temp = arr[pi];
            arr[pi] = arr[ci];
            arr[ci] = temp;

            pi  = ci;
            ci = pi*2;
        }
        return min;
    }

    public int getHeap()
    {
        return arr[1];
    }
}
