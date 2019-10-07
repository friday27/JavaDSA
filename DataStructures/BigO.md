# Big-O Notation
Computational Complexity Analysis

* Goal: To understand the performance that data structures and algorithms provide.
    - How much **time** does this algorithm need to finish?
    - How much **space** dose this algorithm need for computation?

* Big-O Notation
    - To standardize a way of talking about how much time and space we need, Big-O notation is invented.
    - Big-O notation only cares about the worst case.
    - Common examples (n: the size of input)
        - Constant Time: O(1)
        - Logarithmic Time: O(log(n))
        - Linear Time: O(n)
        - Linerithmic Time: O(n log(n))
        - Quadric Time: O(n^2)
        - Cubic Time: O(n^3)
        - Exponential Time: O(b^n), b > 1
        - Factorial TIme: O(n!)
    - Properties
        - O(c+n) = O(n)
        - O(cn) = O(n), c > 0
        - O(7n^3 + 15n^2 + 2n^3 + 8) = o(n^3)
