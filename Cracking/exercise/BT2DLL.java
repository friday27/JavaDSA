/*
    https://www.geeksforgeeks.org/convert-a-given-binary-tree-to-doubly-linked-list-set-4/
    Convert a binary tree to a doubly linked list
    Use left for prev, right for next
*/

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) {
        this.data = d;
        left = right = null;
    }
}

public class BT2DLL {
    public static Node convert2DLL(Node root) {
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return root;
        List<Node> arr = new ArrayList<>();
        arr = helper(arr, root);
        arr.get(0).left = null;
        arr.get(0).right = arr.get(1);
        for(int i=1; i<arr.size()-1; i++) {
            arr.get(i).left = arr.get(i-1);
            arr.get(i).right = arr.get(i+1);
        }
        arr.get(arr.size()-1).left = arr.get(arr.size()-2);
        arr.get(arr.size()-1).right = null;
        return arr.get(0);
    }

    private static List<Node> helper(List<Node> arr, Node current) {
        if(current == null)
            return arr;
        arr = helper(arr, current.left);
        arr.add(current);
        arr = helper(arr, current.right);
        return arr;
    }

    private static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.right;
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        Node root = new Node(10);   
        // Let us create the tree shown in above diagram 
        root.left = new Node(12); 
        root.right = new Node(15); 
        root.left.left = new Node(25); 
        root.left.right = new Node(30); 
        root.right.left = new Node(36); 
   
        // Convert to DLL 
        Node head = convert2DLL(root); 
   
        // Print the converted list 
        printList(head); 
    } 
}