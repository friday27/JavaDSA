
class Node {
    int val;
    Node left, right;
    Node(int v) {
        this.val = v;
        left = right = null;
    }
}

public class MaxPathSum {
    int maxPath(Node root) {
        if(root == null)
            return 0;
        int val = root.val;
        int l = maxPath(root.left, val, Integer.MIN_VALUE);
        int r = maxPath(root.right, val, Integer.MIN_VALUE);
        if(l > val)
            val = l;
        if(val+r > val)
            val += r;
        return val - root.val;
    }

    int maxPath(Node n, int sum, int max) {
        if(n == null)
            return Math.max(sum, max);
        int l = maxPath(n.left, sum+n.val, max);
        int r = maxPath(n.right, sum+n.val, max);
        return Math.max(l, r);
    } 

    public static void main(String[] args) {
        MaxPathSum test = new MaxPathSum();
        Node root = new Node(10); 
        root.left = new Node(2); 
        root.right = new Node(10); 
        root.left.left = new Node(20); 
        root.left.right = new Node(1); 
        root.right.right = new Node(-25); 
        root.right.right.left = new Node(3); 
        root.right.right.right = new Node(4); 
        System.out.println("maximum path sum is : " + test.maxPath(root)); 
    }
}