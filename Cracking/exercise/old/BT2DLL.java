/*
    https://www.geeksforgeeks.org/convert-a-given-binary-tree-to-doubly-linked-list-set-4/
    Convert a binary tree to a doubly linked list
    Use left for prev, right for next
    
    [Solution]
    https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
    https://algorithmsandme.com/binary-tree-to-doubly-linked-list-conversion/

    Question to ask: Which node should be the head of this doubly linked list?
        leftmost node -> inorder (or sorted array as the output)
        root node -> preorder

    [For inorder case]
    If the node is a left child, then the inorder successor would be the parent node.
    If it's a parent node, it would be the leftmost child of the right subtree.
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
    Node root;
    // prev:
    // To keep track of inorder predecessor, 
    // store the previous node of the current node visited throughout traversal. 
    // We would link the left child to the inorder predecessor.
    static Node head, prev;

    public void BinaryTree2DoubleLinkedList(Node root){
        if(root == null)
            return;
        BinaryTree2DoubleLinkedList(root.left);
        if(prev == null) //the leftmost node is the head
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BinaryTree2DoubleLinkedList(root.right);
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
        BT2DLL converter = new BT2DLL();
        converter.BinaryTree2DoubleLinkedList(root);
   
        // Print the converted list 
        printList(head); 
    } 
}