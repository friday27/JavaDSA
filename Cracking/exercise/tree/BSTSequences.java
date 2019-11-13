/*
    Cracking 4.9
    BST Sequences: 
    A binary search tree was created by traversing through an array 
    from left to right and inserting each element. 
    Given a binary search tree with distinct elements, 
    print all possible arrays that could have led to this tree.
*/

import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int v) {
        this.val = v;
        left = right = null;
    }
}

public class BSTSequences {
    public List<List<Integer>> getSeq(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        List<Integer> tmp = new ArrayList<>();
        tmp.add(root.val);
        if(root.left == null && root.right == null) {
            res.add(tmp);
            return res;
        }

        Stack<List<Integer>> stack = new Stack<ArrayList<Integer>>();
        stack.push(tmp);
        while(stack.size())
    }



    public static void main(String[] args) {
        BSTSequences test = new BSTSequences();
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        for(List<Integer> l: test.getSeq(root))
            System.out.println(l);
    }
}