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

* Implementation

        public class Array<T> implements Iterable<T> {
            private T[] arr;
            private int len = 0; //length user thinks array is
            private capacity = 0;  //actual size
            
            public Array() {
                this(16);
            }

            public Array(int capacity) {
                if(capacity < 0)
                    throw new IllegalArgumentException("Illegal capacity: "+capacity);
                this.capacity = capacity;
                arr = (T[]) new Object[capacity];
            }

            public int size() {
                return len;
            }

            public boolean isEmpty() {
                return len == 0;
            }

            public T get(int index) {
                return arr[index];
            }

            public void set(int index, T elem) {
                arr[index] = elem;
            }

            public void clear() {
                for(int i=0; i<capacity; i++)
                    arr[i] = null;
                len = 0;
            }

            public void append(T elem) {
                //resize
                if(len+1>=capacity) {
                    if(capacity==0)
                        capacity = 1;
                    else
                        capacity = 2;
                }
                T[] newArr = (T[]) new Object[capacity];
                for(int i=0; i<arr.len; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }

            public T removeAt(int index) {
                if(index >= len && index < 0)
                    throw new IndexOutOfBondsException();
                T data = arr[index];
                T[] newArr = (T[]) new Object[len-1];
                for(int i=0; i<len; i++) {
                    if(i < index)
                        newArr[i] = arr[i];
                    else if(i == index)
                        i++;
                    else(i > index)
                        newArr[i-1] = arr[i];
                }
                arr = newArr;
                len--;
                capacity--;
                return data;
            }

            public boolean remove(Object obj) {
                for(int i=0; i<len; i++) {
                    if(arr[i].equals(obj)) {
                        remoteAt(i);
                        return true;
                    }
                }
                return false;
            }

            public int indexOf(Object obj) {
                for(int i=0; i<len; i++) {
                    if(arr[i] == obj)
                        return i;
                }
                return -1;
            }

            public boolean contains(Object obj) {
                return indexOf(obj) == -1;
            }


        }