public class Que3 {
    
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

        tree.inOrder(tree.getNode());
        System.out.println();

        tree.deleteNode(3);

        tree.inOrder(tree.getNode());
        System.out.println();
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
        Node newnode = new Node(data);

        if(isEmpty())
            root = newnode;
        else
        {
            if(data < trav.data)
            {
                if(trav.left == null)
                    trav.left = newnode;
                
                else
                    addNode(data, trav.left);
            }
            else
            {
                if(trav.right == null)
                    trav.right = newnode;
                
                else
                    addNode(data, trav.right);
            }
        }
    }

    public Node[] binarySearchWithParent(int key)
    {
        Node trav = root;
        Node parent = null;
        
        while (trav != null)
        {
            if (key == trav.data) {
                break;
            }    
            parent = trav;

            if (key < trav.data) {
                trav = trav.left;
            }
            else
            {
                trav = trav.right;
            }
        }
        if(trav == null)
            parent = null;
        
        return new Node[]{trav, parent};
    }

    public void deleteNode(int key)
    {
        Node result[] = binarySearchWithParent(key);
        Node temp = result[0];
        Node parent = result[1];

        if (temp == null) {
            return;
        }

        if (temp.left != null && temp.right !=null) {
            Node sucessor = temp.right;
            parent = temp;
            while (sucessor.left != null) {
                parent = sucessor;
                sucessor = sucessor.left;
            }
            temp.data = sucessor.data;

            temp = sucessor;
        }
        if(temp.left == null)
        {
            if (temp == root) {
                temp = root.right;
            }
            else if(temp == parent.left)
                parent.left = temp.right;
            else if(temp == parent.right)
                parent.right = temp.right;
        }
        else
        {
            if(temp == root)
                temp = root.left;
            else if(temp == parent.left)
                parent.left = temp.left;
            else if(temp == parent.right)
                parent.right = temp.left;
        }
    }

    public void inOrder(Node trav)
    {
        if(trav == null)
            return;
        inOrder(trav.left);
        System.out.print("  "+ trav.data);
        inOrder(trav.right);
    }
}
