# Graphs

* Terminology
    * Path: Sequence of vertices connected by edges.
    * Cycle: Path whose first and last vertices are the same.
    * 2 Vertices are connected if there is a path between them.

* Common Graph-processing Problems
    * Euler tour: Is there a cycle that uses each edge exactly once?
    * Hamilton tour:  Is there a cycle that uses each vertex exactly once?
    * MST: What is the best way to connect all the verices?
    * Connectivity: Is there a way to connect al the vertices?
    * Biconnectivity: Is there a vertex whose removal disconnects the graph?
    * Planarity: Can you draw the graph in the plane with no crossing edge?
    * Graph isomorphism: Do 2 lists represent the same graph?

* Discussion different ideas to implement graph data structure
    * [Implementation of adjacency lists](implementations/Graph.java)

            +------------------+-------+-----+------------+-----------------+
            | Representation   | Space | Add | V and W    | Iterate over Vs |
            |                  |       |     | connected? | adj to V?       |
            +------------------+-------+-----+------------+-----------------+
            | List of edges    | E     | 1   | E          | E               |
            +------------------+-------+-----+------------+-----------------+
            | Adjacency matrix | V^2   | 1   | 1          | V               |
            +------------------+-------+-----+------------+-----------------+
            | Adjacency lists  | E+V   | 1   | degree(V)  | degree(V)       |
            +------------------+-------+-----+------------+-----------------+

* Undirected Graph
    * Definition: A set of vertices connected pairwise by edges