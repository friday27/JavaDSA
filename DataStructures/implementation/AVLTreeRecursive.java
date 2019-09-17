import java.util.*;

public class AVLTreeRecursive<T extends Comparable<T>> implements Iterable<T> {
    class Node implements TreePrinter.PrintableNode {
        int bf;
        T value;
        int height;
        Node left, right;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public Node getLeft() {
            return left;
        }

        @Override
        public Node getRight() {
            return right;
        }
    }

    private Node root;
    private int nodeCount = 0;

    public int height() {
        if(root == null)
            return 0;
        return root.height;
    }

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void display() {
        TreePrinter.print(root);
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node node, T value) {
        if(node == null)
            return false;

        int cmp = value.compareTo(node.value);
        if(cmp < 0)
            return contains(node.left, value);
        if(cmp > 0)
            return contains(node.right, value);
        return true;
    }

    public boolean insert(T value) {
        if(value == null)
            return false;
        if(!contains(root, value)) {
            root = insert(root, value);
            nodeCount++;
            return true;
        }
        return false;
    }

    private Node insert(Node node, T value) {
        if(node == null)
            return new Node(value);

        int cmp = value.compareTo(node.value);
        if(cmp < 0)
            insert(node.left, value);
        else
            insert(node.right, value);

        // Add below 2 lines for AVL tree
        update(node);
        return balance(node);
    }

    // Update balance factor and height values
    private void update(Node node) {
        int leftNodeHeight = (node.left == null) ? -1: node.left.height;
        int rightNodeHeight = (node.right == null) ? -1: node.right.height;
        node.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);
        node.bf = rightNodeHeight - leftNodeHeight;
    }

    private Node balance(Node node) {
        if(node == -2) { //left heavy
            if(node.left.bf <= 0)
                return leftLeftCase(node);
            else
                return leftRightCase(node);
        }else if(node == 2) {
            if(node.right.bf >= 0)
                return rightRightCase(node);
            else
                return rightLeftCase(node);
        }
        return node;
    }

    private Node leftLeftCase(Node node) {
        return rightRotate(node);
    }

    private Node leftRightCase(Node node) {
        node.left = leftRotate(node.left);
        return leftLeftCase(node);
    }

    private Node rightRightCase(Node node) {
        return leftRotate(node);
    }

    private Node rightLeftCase(Node node) {
        node.right = rightRotate(node.right);
        return rightRightCase(node);
    }

    private Node leftRotate(Node node) {
        Node newParent = node.right;
        node.right = newParent.left;
        newParent.left = node;
        update(node);
        update(newParent);
        return newParent;
    }

    private Node rightRotate(Node node) {
        Node newParent = node.left;
        node.left = newParent.right;
        newParent.right = node;
        update(node);
        update(newParent);
        return newParent;
    }

    public boolean remove(T elem) {
        if(elem == null)
            return false;
        if(contains(root, elem)) {
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
        return false;
    }

    private Node remove(Node node, T elem) {
        if(node == null)
            return null;
        int cmp = elem.compareTo(node.value);
        if(cmp < 0) {
            node.left = remove(node.left, elem);
        }else if(cmp > 0) {
            node.right = remove(node.righ, elem);
        // found it
        }else {
            // Has only right subtree
            if(node.left == null) {
                return node.right;
            // Has only right subtree
            }else if(node.right == null) {
                return node.left;
            }else {
                if(node.left.height > node.right.height) {
                    T successiveValue = findMax(node.left);
                    node.value = successiveValue;
                    node.left = remove(node.left, successiveValue);
                }else {
                    T successiveValue = findMin(node.right);
                    node.value = successiveValue;
                    node.right = remove(node.right, successiveValue);
                }
            }
        }
        update(node);
        return balance(node);
    }

    private T findMin(Node node) {
        while(node.left != null)
            node = node.left;
        return node.value;
    }

    private T findMin(Node node) {
        while(node.right != null)
            node = node.right;
        return node.value;
    }

    // Example usage of AVL tree.
    public static void main(String[] args) {
        AVLTreeRecursive<Integer> tree = new AVLTreeRecursive<>();
        for(int i=0; i<22; i++)
            tree.insert((int)(Math.random()*100));
        tree.display();
    }
}