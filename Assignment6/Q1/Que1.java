// write a recursive function to add node into bst 
public class Que1 {
    public static void main(String[] args) {
        BsTree tree = new BsTree();

        tree.addNode(8,tree.getNode());
        tree.addNode(3,tree.getNode());
        tree.addNode(10,tree.getNode());
        tree.addNode(6,tree.getNode());
        tree.addNode(1,tree.getNode());
        tree.addNode(14,tree.getNode());
        tree.addNode(13,tree.getNode());
        tree.addNode(7,tree.getNode());
        tree.addNode(4,tree.getNode());

        tree.inOrder();
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

    public void addNode(int data,Node trav)
    {
        Node newnNode = new Node(data);
        if (isEmpty()) {
            root = newnNode;
        }
        else
        {
            if(data < trav.data)
            {
                if (trav.left == null) {
                    trav.left = newnNode;
                }
                else
                {
                    addNode(data,trav.left);
                }
            }
            else
            {
                if (trav.right == null){
                    trav.right = newnNode;
                }
                else
                {
                    addNode(data, trav.right);
                }
            }
            
        }
    }

    public void inOrder(Node trav)
    {
        if(trav == null)
            return;
        inOrder(trav.left);
        System.out.print(" " + trav.data);
        inOrder(trav.right);
    }

    public void inOrder()
    {
        System.out.print("Inorder : ");
        inOrder(root);
        System.out.println();

    }
}