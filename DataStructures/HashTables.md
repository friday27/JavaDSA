# Hash Tables

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