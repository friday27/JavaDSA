# Union Find

* Union Find is a data structure that keep track of elements which are split into one or more disjoint sets. It has 2 primary operations: find and union.
    * To **find** which component a particular element belongs: to find the root of that component by following the parent nodes until a self loop is reached (a node whose parent is itself)
    * To **unify** 2 elements: find wich are the root nodes of each component and if the root nodes are different make one of the root nodes be the parent of the other.

### Complexity Analysis

        +--------------------+------+
        | Construction       | O(n) |
        +--------------------+------+
        | Union              | a(n) |
        +--------------------+------+
        | Find               | a(n) |
        +--------------------+------+
        | Get component size | a(n) |
        +--------------------+------+
        | Check if connected | a(n) |
        +--------------------+------+
        | Count components   | O(1) |
        +--------------------+------+
        * a(alpha): amortized constant time

### Kruskal's Minimum Spanning Tree

Given a graph G = (V, E) we want to find a minimum spanning tree in the graph (it may not be unique). A minimum spanning tree is a subset of the edges which connect all vertices in the graph with the minimal total edge cost.

* Process (Use Union Find to calculate the minimal total edge cost)
    1. Sort edges by ascending edge weight.
    2. Walk through the sorted edges and look at the 2 nodes the edge belongs to, if the node are already unified we don't include this edge, otherwise we include it and unify the nodes (as a new group).
    3. The algorithm terminates when every edge has been processed or all the vertices have been unified.

### Path Comparison

A process that after you union some elements as a group, find the root and point every other nodes to root node. When you need to union 2 groups, you just simply point the root node of the group A to the root node of group B.

(add a screenshot of 3:15)


