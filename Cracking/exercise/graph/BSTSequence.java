/*
    Cracking 4.9 BST Sequence
    A binary search tree was created by traversing through an array from left to right 
    and inserting each element. Given a binary search tree with distinct elements, 
    print all possible arrays that could have led to this tree.
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

public class BSTSequence {
    List<List<Integer>> getPossibleArrays(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        List<Integer> sub = new ArrayList<>();
        sub.add(root.data);
        res.add(sub);
        preOrder(list, root.left, root.right);
        return res;
    }

    void preOrder(List<List<Integer>> list, Node left, Node right) {
        if(left == null && right == null)
            return;
        if(left != null && right != null) {
            for(int i=0; i<list.size(); i++) {
                List<Integer> tmp = list.get(i);
                tmp.add(left.data);
                tmp.add(right.data);
                list.add(tmp);

                list.get(i).add(right.data);
                list.get(i).add(left.data);
            }
        }else if(left != null) {
            
        }else { //right != null

        }


        for(int i=0; i<list.size(); i++) {
            list.get(i).add(root.data);
        }
        if(root.left != null && root.right != null) {
            for(int i=0; i<list.size(); i++) {
                list.add(list.get(i));
            }
        }else if(root.left == null && root.right == null) {
            return;
        }else { //one child is not null
            if(root.left != null)
                preOrder(list, root.left);
            if(root.right != null)
                preOrder(list, root.right);
        }
    }
}