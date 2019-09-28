/*
    Cracking 4.3
    Given a sorted (increasing order) array, 
    write an algorithm to create a binary tree with minimal height
*/

import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

// Time complexity: O(n)
public class SortedArr2BST {
    static Node root = null;

    public static Node sorted(int[] arr, int start, int end) {
        if(start > end)
            return null;
        int mid = start + (end-start)/2;
        Node node = new Node(arr[mid]);
        node.left = sorted(arr, start, mid-1);
        node.right = sorted(arr, mid+1, end);
        return node;
    }

    // print tree with level order
    public static void printTree() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.val+" ");
            if(current.left != null)
                queue.offer(current.left);
            if(current.right != null)
                queue.offer(current.right);
        }
        System.out.println();
    }

    public static void main(String[] arr) {
        int[] input1 = {1,2,3,4,5,6,7,8,9};
        SortedArr2BST tree1 = new SortedArr2BST();
        root = tree1.sorted(input1, 0, input1.length-1);
        tree1.printTree();

        int[] input2 = {1};
        SortedArr2BST tree2 = new SortedArr2BST();
        root = tree2.sorted(input2, 0, input2.length-1);
        tree2.printTree();

        int[] input3 = {1,2,3,4};
        SortedArr2BST tree3 = new SortedArr2BST();
        root = tree3.sorted(input3, 0, input3.length-1);
        tree3.printTree();
    }
}