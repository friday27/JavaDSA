# Array

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
* [Easy]  1. [Two Sum](https://leetcode.com/problems/two-sum/)
* [Easy]  26. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
* [Easy]  27. [Remove Element](https://leetcode.com/problems/remove-element/)
* [Easy]  35. [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
* [Easy]  66. [Plus One](https://leetcode.com/problems/plus-one/)
