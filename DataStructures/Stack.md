# Stack

A stack is a one-ended linear data structure which models a real world stack by having 2 primary operations, namely push and pop.

### Complexity Analysis

        +-----------------+
        | Push   | O(1)   |
        +-----------------+
        | Pop    | O(1)   |
        +-----------------+
        | Peek   | O(1)   |
        +-----------------+
        | Search | O(n)   | <- Still takes linear time
        +-----------------+
        | Size   | O(1)!! |
        +-----------------+

### Examples: Brackets

        //Let s be stack
        for bracket in input ;
            //either this bracker is a left bracket
            if isLeftBracket(bracket):
                s.push(bracket)
            //or it's a right bracket
            else if s.isEmpty() or s.pop() != getReversedBracket(bracket):
                return false
        return s.isEmpty()

### Related Leetcode Problems
* [Easy]  20.[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
* [Easy]
* [Easy]
* [Easy]
* [Easy]
