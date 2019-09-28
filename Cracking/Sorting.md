# Sorting

### Built-in Sort
* `Arrays.sort()`
    * Time Complexity: [O(nlogn)](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(int[]))
        * It uses a kind of quick sort for primitive data types
        * Uses mergesort for Object array since it's guaranteed to be stable

* `Arrays.parallelSort(arr)`

* `Collections.sort(arr)`
    * Time Complexity: O(nlogn), where it uses mergesort

* Sorting custom objecys
    * `a.compareTo(b)`


### Selection Sort [link](../Algorithms/implementation/SelectionSort.java)
* Concept
    1. Point to i and find the smallest element from i+1 to the last element
    2. Switch(Swap) the found element with the ith element

* Complexity
    * Time: O(n^2) on average and worst case (It takes time proportional to n square)
    * Space: O(1)


### Insertion Sort [link](../Algorithms/implementation/InsertionSort.java)
* Concept: Starting from index 1, swap the element i with its previous element j if the value of i is less than the value of j

* Complexity: O(n^2) (It takes time proportional to n square)


### Bubble Sort [link](../Algorithms/implementation/BubbleSort.java)
* Concept
    1. Starting from the last element, if it's less than the previous element, swap it
    2. After the first run, the first element is sorted. Keep doing this until the whole array is sorted

* Complexity 
    * Time: O(n^2) on average and worst cast (It takes time proportional to n square)
    * Space: O(1)

### Heap Sort [link](../Algorithms/implementation/HeapSort.java)
* Concept
    1. Starting from the root node (index i), switch it with its largest child node if it's less than the child node (2i+1, 2i+2)
    2. ?

* Complexity: O(nlogn)


### Quick Sort [link](../Algorithms/implementation/QuickSort.java)
* Not a stable algorithm
* Concept
    1. Choose an element from the list, called it pivot
    2. Reorder all the elements – the ones with smaller value are placed before the pivot, and all the elements greater than the pivot after it. After this step, the pivot is in its final position
    3. Apply the above steps recursively to the left sublist and the right sublist

* Complexity: 
    * Time: O(n logn) on average, O(n^2) worst
        * The first iteration takes O(n)
        * The second iteration takes 2xO(n/2)
        * In the worst case, O(n^2)
    * Space: O(logn)
    

### Merge Sort [link](../Algorithms/implementation/MergeSort.java)
* Concept
    * The algorithm can be described as the following 2 step process:
        1. Divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide
        2. Sort and merge the divided arrays from bottom to top and get the sorted array

* Complexity
    * Time complexity: O(n logn) on average and worst case
    * Space complexity: O(n)


### Bucket Sort [link](../Algorithms/implementation/BucketSort.java)
* Condition: Knowing the range of elements in the array
* Concept
    1. Create a bucket with length `(maxValue-minValue) / arr.length + 1`, so each bucket presents a certain range of data
    2. Put every into the bucket it belongs
    3. Sort elements in every bucket
    4. Put every sorted bucket into the result array

* Complexity?


### Counting Sort [link](../Algorithms/implementation/CountingSort.java)
* Condition: Knowing the range of elements in the array
* Concept
    1. Create an array with length `maxValue - minValue + 1`
    2. Loop the input array, count the number of each element and add the counting result to the array created in step 1
    3. Create a sorted array accordingly

* Complexity: O(n+k), where k equals to the length of counting array
