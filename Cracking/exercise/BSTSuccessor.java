/*
    Find the in-order successor for a node in a binary search tree.
*/

class Node {
    int data;
    Node left, right, parent;
    Node(int data) {
        this.data = data;
        left = right = parent = null;
    }
}

public class BSTSuccessor {
    static Node root;

    static Node insert(Node node, int data) {
        if(root == null)
            return new Node(data);
        if(data > node.data) {
            node.right = insert(node.right, data);
            node.right.parent = node;
        }else {
            node.left = insert(node.left, data);
            node.left.parent = node;
        }
        return node;
    }

    static int inOrderSuccessor(Node node) {
        if(node == null)
            return -1;
        // The node has a right child.
        if(node.right != null) {
            return minVal(node.right);
        }
        // No right child.
        Node p = node.parent;
        // 2 Constraints:
        // (1) p equals to null means this node is the root node without right child, so it doesn't have a succesor.
        // (2) If node is a left child node, the successor of it would it its parent node.
        while(p != null && node == p.right) {
            node = p;
            p = p.parent;
        }
        if(p == null)
            return -1;
        return p.data;
    }

    static int minVal(Node current) {
        while(current.left != null)
            current = current.left;
        return current.data;
    }

    public static void main(String[] args) {
        BSTSuccessor tree = new BSTSuccessor();
        root = new Node(20);
        Node test1 = tree.insert(root, 8);
        System.out.println(tree.inOrderSuccessor(test1));
        Node test2 = tree.insert(root, 22);
        System.out.println(tree.inOrderSuccessor(test2));
        Node test3 = tree.insert(root, 4);
        System.out.println(tree.inOrderSuccessor(test3));
        Node test4 = tree.insert(root, 12);
        System.out.println(tree.inOrderSuccessor(test4));
        Node test5 = tree.insert(root, 10);
        System.out.println(tree.inOrderSuccessor(test5));
        Node test6 = tree.insert(root, 14);
        System.out.println(tree.inOrderSuccessor(test6));
    }
}