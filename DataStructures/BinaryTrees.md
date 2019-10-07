# Binary Trees (BT) and Binary Search Trees (BST)

### Terminology
* A tree is an undirected graph which satisfies any of the following definitions:
    * An acyclic (non-cycle) connected graph
    * A connected graph with N nodes and N-1 edges
    * An graph in which any 2 vertices are connected by exactly 1 path

* A BST is a binary tree that satisfies the BST invariant: left subtree has smaller elements and right subtree has larger elements.

### Complexity Analysis

        +-------------+-----------+-------+
        | Operation   | Avg       | Worst |
        +-------------+-----------+-------+
        | Insert      | O(log(n)) | O(n)  |
        +-------------+-----------+-------+ 
        | Delete      | O(log(n)) | O(n)  |
        +-------------+-----------+-------+
        | Remove      | O(log(n)) | O(n)  |
        +-------------+-----------+-------+
        | Search      | O(log(n)) | O(n)  |
        +-------------+-----------+-------+
        * The worst case: All the adding elements are greater than the previous one, or all the adding elements are less than the previous one

### Adding elements to a BST
The inserting operation is a process of comparison:
* (< case) recursive down left subtree
* (> case) recursive down right subtree
* (= case) handle find a duplicate value
* (found a null leaf) create a new node

### Removing elements from a BST
It can be seen as a 2 step process:
1. **Find** the element to be removed (if it exists)
2. **Replace** the node to be removed with it's successor (if any) to maintain the BST invariant. Below are 4 cases of removing phase:
    1. The node is a leaf node -> just remove it!
    2. The node has a right subtree -> the successor would be the root node of right subtree
    3. The node has a left subtree -> the successor would be the root node of left subtree
    4. The node has both left and right subtrees -> the successor could be either the smallest node of left subtree or the biggest node of right subtree, since it would be the seperating number of left and right subtrees

### Tree Traversals
The 3 types of traversals are naturally defined recursively:
* preorder: order from left to right, top to bottom

        preorder(node):
            if node == null: return
            print(node.node)
            preorder(node.left)
            preorder(node.right)

* **inorder**: order ascending by values

        inorder(node):
            if node == null: return
            inorder(node.left)
            print(node.node)
            inorder(node.right)

* postorder

        postorder(node):
            if node == null: return
            postorder(node.left)
            postorder(node.right)
            print(node.node)

* level order traversal
    * To print the nodes as they appear 1 layer at a time
    * Use a queue and poll from the queue and offer the child nodes of the removed node to the queue, until the queue is empty


### Related Leetcode Problems
* [Easy]  107. [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
* [Easy]  690. [Employee Importance](https://leetcode.com/problems/employee-importance/)
* [Medium]  1038. [Binary Search Tree to Greater Sum Tree](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/)