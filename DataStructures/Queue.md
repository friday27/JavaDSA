# Queue

* A queue is a linear data structure which models real world queues by 2 primary operations namely enqueue and dequeue. 

* A queue is an abstract data type (ADT), hence it can be implemented using what ever underlying data structure you want. There it no best answer, although the most popular choices are to use either an array or a linked lists because of the nice time complexity benefits.

### Complexity Analysis

        +-----------------+
        | Enqueue  | O(1) |
        +-----------------+
        | Dequque  | O(1) |
        +-----------------+
        | Peek     | O(1) |
        +-----------------+
        | Contains | O(n) |
        +-----------------+
        | Removal  | O(n) |
        +-----------------+
        | Is Empty | O(1) |
        +-----------------+

### Examples: BFS, Breadth First Search

        // Let Q be Queue
        Q.enqueue(starting_node)
        starting_mode.visted = true

        while Q is not empty Do
            node = Q.dequeue()

            for neighbor in neighbors(node):
                If neighbor has not been visited:
                    neightbor.visited = true
                    Q.enqueue(neighbor)

### Related Leetcode Problems
* No easy problem for Queue
* [Medium]  622. [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
* [Medium]  641. [Design Circular Deque](https://leetcode.com/problems/design-circular-deque/)
