// Write recursive function to perfrom search operation in bst.
public class Que2 {
    public static void main(String[] args)
    {
        BsTree tree = new BsTree();

        tree.addNode(8,tree.getNode());
        tree.addNode(3,tree.getNode());
        tree.addNode(10,tree.getNode());
        tree.addNode(6,tree.getNode());
        tree.addNode(1,tree.getNode());
        tree.addNode(14,tree.getNode());
        tree.addNode(13,tree.getNode());

        BsTree.Node result = tree.binarySearch(6, tree.getNode());
        if(result == null)
            System.out.println("Key is not found !!");
        else
            System.out.println("Key is found !!");

        BsTree.Node result1 = tree.binarySearch(20, tree.getNode());
        if(result1 == null)
            System.out.println("Key is not found !!");
        else
            System.out.println("Key is found !!");
    }
}

class BsTree
{
    static class Node
    {
        private int data;
        private Node left;
        private Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    public BsTree()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public Node getNode()
    {
        return root;
    }

    public void addNode(int data, Node trav)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            root = newNode;
        }
        else
        {
            if(data < trav.data)
            {
                if(trav.left == null)
                {
                    trav.left = newNode;
                }
                else
                {
                    addNode(data, trav.left);
                }
            }
            else
            {
                if(trav.right == null)
                {
                    trav.right = newNode;
                }
                else
                {
                    addNode(data, trav.right);
                }
            }
        }
    }

    public Node binarySearch(int key , Node trav)
    {
        if(trav == null)
            return null;
        
        if (key ==  trav.data) {
            return trav;
        }
        else if(key < trav.data)
            return binarySearch(key, trav.left);
        else
            return binarySearch(key, trav.right);
        
    }
}
