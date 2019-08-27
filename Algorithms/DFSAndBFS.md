# DFS and BFS

### Depth First Search, DFS

* Questions
    * Is there a path from A to B?

* Goal: Systematically search through a graph
* Idea: Mimic maze exploration
* Process
    1. Mark V as visited
    2. Recursively visist all unmarked vertices W adjacent to V.

* Algorithms
    1. Use recursion
    2. Mark each visited vertex (and keep track of edge taken to visit it)
    3. Retrace steps when no unvisited options

* Data Structures
    * **boolean[] marked** to mark visited vertices
    * **int[] edgeTo** to keep track of paths

* DFS Properties
    * DFS marks all vertices connect to s in time propotional to the sum of their degrees.
    * After DFS, can find vertices connected to s in constant time and can find a path to s, if one exists, in time proportional to its length.
    * Correctness
        * If w marked, then w connected to s.
        * If w connected to s, then w marked.

-----
### Breadth First Search, BFS

* Questions
    * Find the shortest path from A to B

* BFS is not a recursive algorithm. It use a queue as a axillary data structure.
* BFS puts unvisited vertices on a queue (while DFS puts unvisited vertices on a stack)
* Shortest Path
    1. Put s into a FIFO queue, and mark s as visited
    2. Repeat until the queue is empty
        1. Dequeue (remove the least added vertex v)
        2. Enqueue all unvisited neighbors of v and mark them as visited

-----
### Related Leetcode Problems
* [Easy]  100. [Same Tree](https://leetcode.com/problems/same-tree/)
* [Easy]  101. [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
* [Easy]  104. [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
* [Easy]
* [Easy]