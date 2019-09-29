# Trees

A tree is a connected graph without cycles.

### Types
* Complete BT
    * A complete binary tree is a binary tree in which every level of the tree is fully filled, except for the last level. To the extent that the last level is filled, it is filled left to right.

* Full BT
    * A full binary tree is a binary tree in which every node has either zero or two children.

* Perfect BT
    * A perfect binary tree is one that is both full and complete. All leaf nodes will be at the same level, and this level has the maximum number of nodes.
    * A perfect tree must have exactly 2^k - 1 nodes {where k is the number of levels)


### BT Traversals
* [Source Code](exercise/BinaryTreeTraversals.java)


### Binary Heaps/ Priority Queues (Min Heaps and Max Heaps)
* Turning min PQ into max PQ: Change the values
    * An alternative method for numbers is to negate the number as you insert them into the PQ and negate them again when thay are taken out. This has the same effect as negating the comparator.

* The step to **insert** 1 element to the binary heap - O(log(n))
    1. Add it to the last position
    2. If the value of the parent node is bigger than the newly added node, just swap the parent node and the child node (bubble up) (Goal: To make sure tree invairant is satisfied)
    3. Repear step 2 until the value of the parent node is less or equal to the newly added node

* The step to **poll** element from the binary heap (from the top) - O(log(n))
    1. Swap the root node and the last node
    1. Remove it from the last position
    2. Check the root (swapped) node. If the value of the root node is greater than its child nodes, swap it. (bubble down)


### Tries (Prefix Trees)
* Use a * node (or null node) to indicate complete words.
* Tries can check if a string is a prefix of any valid word in O(K) time, where K is the length of the string.
