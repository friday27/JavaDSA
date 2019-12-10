# Data Structures and Algorithms in Java

# TODOs
* Cracking
    * Part I. The Interview Porcess
    * Part III. Special Situations
    * Part IV. Before the Interview
    * Part V. Behavirol Questions
* Review Data Structures
* Review Algorithms
* OOP Design
* Recursion
* Dynamic Programming
* System Design
    * Concepts review
    * Cases
* Testing
* Java (Ch.13)
* Databases (ch.14)
* Threads and Locks (ch.15)
* Additional Review Problems (ch.16 & 17)
* Advanced Topics ()

# Data Structures
### Arrays
* Difference between array and list

### Linked List

### Hash Table

### Stack

### Queue

### Tree

### Graph

# Algorithms
### Sorting

### Searching

# Advanced Topics
### Recursion and Dynamic Programming
* How to approach
Divide a problem into subproblems
    1. Bottom-Up: Start from the base case
    2. Top-Down: Start from dividing case N into subproblems (be careful of overlapping)
    3. Half-and-half (E.g. binary search, merge sorting)

* Recursion v.s. Iterative Solutions
Recursive algorithms can be very space inefficient. Each recursive call adds a new layer to the stack, which means that if your algorithm recurses to a depth of n, it uses at least 0(N) memory. 
For this reason, it's often better to implement a recursive algorithm iteratively. All recursive algorithms can be implemented iteratively, although sometimes the code to do so is much more complex. 
Before diving into recursive code, ask yourself how hard it would be to implement it iteratively, and discuss the tradeoffs with your interviewer.

* Drawing the recurisve calls as a tree is a great way to figure out the runtime of a recursive algorithm.

* Basic Problems
    * [Fibonacci](cracking/dynamic_programming/Fibonacci.java)
    * [8.1 Triple Step](cracking/dynamic_programming/TripleStep.java)
    * [8.2 Robot in a Grid]

-----
### References
#### Online courses
* [Udemy: Easy to Advanced Data Structures](https://www.udemy.com/course/introduction-to-data-structures/)
* [Udemy: Graph Theory Algorithms](https://www.udemy.com/course/graph-theory-algorithms/)

#### Online learning materials
* [educative: Grokking the System Design Interview](https://www.educative.io/explore)