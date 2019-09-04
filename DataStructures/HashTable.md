# Hash Table

* A hash table is a data structure that provides a mapping from keys to values using a technique called hashing.

* A key must be **hashable** (immutable data types).

### Hash function
* A hash function H(x) is a function that maps a key 'x' to a whole number in a fixed range.

* Hash functions must be deterministic (always produce the same output for a specific input).

* If H(x) == H(y) then objects a and y might be equal, but if H(x) != H(y) then x and y are certainly not equal. Comparing hash values (the output of hash function) first would make the comparing process more effective.

* Hash functions for files are more complex than those used for hashtables. Instead for files we use what are called cryptographic hash functions also called checksums.

* How to resolve **hash collision**? Here are the most popular 2 methods:
    1. Seperate chaining
    2. Open addressing

### Complexity Analysis

        +-----------+------+-------+
        | Operation | Avg  | Worst |
        +-----------+------+-------+
        | Insert    | O(1) | O(n)  |
        +-----------+------+-------+
        | Remove    | O(1) | O(n)  |
        +-----------+------+-------+
        | Search    | O(1) | O(n)  |
        +-----------+------+-------+
        * The constant time behavior arrributed to hash tables is only true if you have a good uniform hash function.

### Seperate Chaining
* Seperate chaining deals with hash collisions by maintaining a data structure (usually a linked list) to hold all the different values which hashed to a particular value.

* If the HT is too crowded, you could always create a new HT with a larger capacity and rehash all items.

* To remove a key-value pair from a HT, lookup for the key and remove the node in the liked list data structure.

### Open addressing
* Open addressing deals with hash collisions by finding another place within the hash table for the object to go by offsetting it from the position to which it hashed to.

* When using open addressing as a collision resolution technique the key-value pairs are stored in the table(array) itself, as opposed to a data structure like in seperate chaining. This means we need to care a great deal about the size of our hash table and how many elements are currently in the table.

        Load factor = items in table / size of the table

* There are an infinite amount of probing sequences you can come up with, here are a few:
    * Linear probing

            P(x) = ax + b where a, b are constants

    * Quadratic probing

            P(x) = ax^2 + bx + c, where a, b, c are constants

    * Double hashing

            P(k, x) = x*H2(k), where H2(k) is a secondary hash function

    * Pseudo random number generator

            P(k, x) = x*RNG(H(k), x), where RNG is a random number generator function seeded with H(k)

* General inserting method for open addressing on a table of size N goes as follows:

        x = 1 // as a specific factor, if collision happens, increment x by 1
        keyHash = H(x)
        index = keyHash
        
        while table[index] != null
            index = (keyHash + P(k, x)) mod N
            x = x + 1

        insert (k, v) at table[index]
        // Where H(k) is the hash for the key k and P(k, x) is the probing function

### Issue with removing
* Use naive removing (probe to the next element while the hash result doesn't equal to the target result nor null) would output wrong sometimes. 

* The solution is to use a unique marker called a **tombstone** instead of null to indicate that a (k, v) pair has been deleted and that the bucket should be skipped during a search.

* **Lazy deletion**: Lots of tombstones might cause a crowded table. An optimization called lazy deletion is to replace the first tombstone with the value we did look up for (x) and set x to null.

### Related Leetcode Problems
* [Easy] 136. [Single Number](https://leetcode.com/problems/single-number/)
* [Easy] 202. [Happy Number](https://leetcode.com/problems/happy-number/)
* [Easy] 217. [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
* [Easy] 219. [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)
* [Easy] 
