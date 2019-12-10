# Stack

A stack is a one-ended, last in first out, linear data structure which models a real world stack by having 2 primary operations, namely push and pop.

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
* [Easy]  155. [Min Stack](https://leetcode.com/problems/min-stack/)
* [Easy]  232. [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
* [Easy]  496. [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)
* [Easy]  682. [Baseball Game](https://leetcode.com/problems/baseball-game/)
