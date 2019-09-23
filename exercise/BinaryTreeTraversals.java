import java.util.*;

public class BinaryTreeTraversals {
    static Node root;

    class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Insert Node
    public void insert(int val) {
        if(root == null) {
            root = new Node(val);
        }else {
            Queue<Node> q = new LinkedList<Node>();
            q.offer(root);
            while(!q.isEmpty()) {
                Node current = q.poll();
                if(current.left == null) {
                    current.left = new Node(val);
                    break;
                }
                else if(current.right == null) {
                    current.right = new Node(val);
                    break;
                }
                else {
                    q.offer(current.left);
                    q.offer(current.right);
                }
            }
        }
    }

    //pre-order
    public void preOrder(Node node) {
        if(node == null)
            return;
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //in-order
    public void inOrder(Node node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    //post-order
    public void postOrder(Node node) {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    //lever order
    public void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<Node>();
        q.offer(node);
        while(!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.val+" ");
            if(current.left != null)
                q.offer(current.left);
            if(current.right != null)
                q.offer(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversals test = new BinaryTreeTraversals();
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.insert(4);
        test.insert(5);
        test.insert(6);
        test.insert(7);
        test.preOrder(root);
        System.out.println();
        test.inOrder(root);
        System.out.println();
        test.postOrder(root);
        System.out.println();
        test.levelOrder(root);
        System.out.println();
    }
}