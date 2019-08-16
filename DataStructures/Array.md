# Array

### Computational Complexity Analysis
* Goal: To understand the performance that data structures provide.
    - How much **time** does this algorithm need to finish?
    - How much **space** dose this algorithm need for computation?
* Big-O Notation
    - To standardize a way of talking about how much time and space we need, Big-O notation is invented.
    - Big-O notation only cares about the worst case.
    - Common examples (n: the size of input)
        - Constant Time: O(1)
        - Logarithmic Time: O(og(n))
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

### Complexity
* Static array is fixed-size continar
* Dynamic array can grow and shrink

        +-----------+-----------+-------------+
        |           |   Static  |   Dynamic   |
        +-----------+-----------+-------------+
        |   Access  |   O(1)    |   O(1)      |
        |   Search  |   O(n)    |   O(n)      |
        |   Insert  |   N/A     |   O(n)      |
        |   Append  |   N/A     |   O(1)      |
        |   Delete  |   N/A     |   O(n)      |
        +-----------+-----------+-------------+

* Dynamic array implementation
    - Use a static array: Create a static array with an initial capacity. In adding another elemtent will exceed the capacity, create a static array with twice the capacity and copy the original elements to it

### Related Leetcode Problems
[Easy]  1. [Two Sum](https://leetcode.com/problems/two-sum/)
[Easy]  26. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
[Easy]  27. [Remove Element](https://leetcode.com/problems/remove-element/)
[Easy]  35. [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
[Easy]  66. [Plus One](https://leetcode.com/problems/plus-one/)
