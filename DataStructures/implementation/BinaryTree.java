/*
 *  Java Program to Implement Binary Tree
 *  https://www.sanfoundry.com/java-program-implement-binary-tree/
 */
 
 import java.util.Scanner;
 
 class BTNode
 {    
     BTNode left, right;
     int data;

     public BTNode() {
         left = null;
         right = null;
         data = 0;
     }

     public BTNode(int n) {
         left = null;
         right = null;
         data = n;
     }
 }
 
 class BT
 {
     private BTNode root;
     private int size;
 
     public BT() {
         root = null;
         size = 0;
     }

     public boolean isEmpty() {
         return size() == 0;
     }
     
     public void insert(int data) {
         root = insert(root, data);
         size++;
     }

     private BTNode insert(BTNode node, int data) {
         if (node == null)
             node = new BTNode(data);
         else {
             if (node.left == null)
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);             
         }
         return node;
     }     

     public int size() {
         return size;
     }

     public int countNodes() {
        return countNodes(root);
     }

     private int countNodes(BTNode r)
     {
         if (r == null)
             return 0;
         else {
             int l = 1;
             l += countNodes(r.left);
             l += countNodes(r.right);
             return l;
         }
     }

     public boolean search(int val) {
         return inorder(root, val) == val;
     }

     // private boolean search(BTNode r, int val) {
     //     if (r.data == val)
     //         return true;
     //     if (r.left != null)
     //         if (search(r.left, val))
     //             return true;
     //     if (r.right != null)
     //         if (search(r.right, val))
     //             return true;
     //     return false;         
     // }

     // public void inorder(int key) {
     //     inorder(root);
     // }

     private int inorder(BTNode r, int key) {
         if (r != null) {
             inorder(r.left, key);
             System.out.print(r.data+" ");
             if(r.data == key)
                return key;
             inorder(r.right, key);
         }
         return -1;
     }

     public void preorder() {
         preorder(root);
     }

     private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.data+" ");
            preorder(r.left);             
            preorder(r.right);
        }
     }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.left);             
            postorder(r.right);
            System.out.print(r.data+" ");
        }
    }     
 }
 
public class BinaryTree {
    public static void main(String[] args) {            
        Scanner scan = new Scanner(System.in);
        BT bt = new BT(); 
        System.out.println("Binary Tree Test\n");          
        char ch;        
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
 
            int choice = scan.nextInt();            
            switch (choice) {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bt.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ bt.countNodes());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ bt.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            // System.out.print("\nIn order : ");
            // bt.inorder();
 
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}
