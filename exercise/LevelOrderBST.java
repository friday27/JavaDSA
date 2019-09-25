/*
    Cracking 4.4
    Given a binary search tree, design an algorithm which creates a linked list 
    of all the nodes at each depth 
    (i e , if you have a tree with depth D, you’ll have D linked lists)
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

public class LevelOrderBST {
    public static List<List<Node>> bst2list(Node root) {
        int level = 0;
        List<List<Node>> list = new ArrayList<>();
        List<Node> subList = new ArrayList<Node>();
        subList.add(root);
        list.add(level, subList);

        while(true) {
            subList = new ArrayList<Node>();
            //get the parent nodes
            for(int i=0; i<list.get(level).size(); i++){
                Node n = list.get(level).get(i);
                if(n != null) {
                    if(n.left != null)
                        subList.add(n.left);
                    if(n.right != null)
                        subList.add(n.right);
                }
            }
            if(subList.size() > 0)
                list.add(++level, subList);
            else
                break;
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        List<List<Node>> res = bst2list(root);
        for(List<Node> r: res) {
            for(Node n: r)
                System.out.print(n.val+" ");
            System.out.println();
        }
    }
}