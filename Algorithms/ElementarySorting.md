# Elementary Sorting

### Bubble Sort - O(n^2)
* Process
    1. Starting from the last element, if the previous element is larger than it, swap them. 
    2. Keep doing this comparison until reach index 1, and it means elements before index 1 is sorted.
    3. Starting from the last element again, keep comparing 2 elements until the sorted index is reached 

        for(int i=0; i<arr.length; i++) {
            for(int j=arr.length-1; j>i; j--) {
                if(arr[j] < arr[j-1])
                    arr = swap(arr, j, j-1);
            }
        }

### Selection Sort - O(n^2)
* Process
    * In iteration i, find the index of the smallest one from the remaining elements. (i+1 ~ end)
    * Swap(i, min) so the elements before index i would be sorted.

            public static void selectionSort(int[] arr) {
                if(arr == null)
                    return;
                for(int i=0; i<arr.length; i++) {
                    int minIdx = i;
                    // j = i+1, no need to compare with the selected element itself
                    for(int j=i+1; j<arr.length; j++) {
                        if(arr[j] < arr[minIdx])
                            minIdx = j;
                    }
                    arr = swap(arr, i, minIdx);
                }
            }

### Insertion Sort - O(n^2)
* Make index 0 as the first sorted element. Starting from index 1, compare from the last element in the sorted array and move forawrd if it's smaller until it meets a smaller element.

        public static void insertionSort(int[] arr) {
            if(arr == null | arr.length <= 1)
                return;
            // Since index 0 is sorted, we can start from index 1
            for(int j=1; j<arr.length; j++) {
                int i = j - 1;
                while(i > -1 && arr[j] < arr[i]) {
                    arr = swap(arr, i, j);
                    j--;
                    i = j - 1;
                }
            }
        }

### Shell Sort
* Shell sort is based on the insertion sorting algorithm, and it belongs to the group of very efficient algorithms. In general, the algorithm breaks an original set into smaller subsets and then each of those is sorted using insertion sort.

        public void sort(int arrayToSort[]) {
            int n = arrayToSort.length;
            for(int gap = n / 2; gap > 0; gap /= 2) {
                for(int i = gap; i < n; i++) {
                    int key = arrayToSort[i];
                    int j = i;
                    while (j >= gap && arrayToSort[j - gap] > key) {
                        arrayToSort[j] = arrayToSort[j - gap];
                        j -= gap;
                    }
                    arrayToSort[j] = key;
                }
            }
        }

* Generally, the Shell sort algorithm is very efficient with medium-sized lists. The complexity is difficult to determine since it depends a lot on the gap sequence, but the time complexity varies between O(N) and O(N^2). The worst-case space complexity is O(N) with O(1) auxiliary space.

### Heap Sort - O(n log(n))
* Process
    * Convert an array to a max heap
    * Get max value from the top and switch it to the end and sink the switched value

            public static void heapSort(int[] arr) {
                if(arr == null)
                    return;

                int n = arr.length;
                // n/2-1 -> calucalte the index of the last parent node
                for(int i=Math.max(0, n/2-1); i>=0; i--)
                    sink(arr, n, i);

                // we first find the maximum element and place the maximum element at the end. 
                for(int i=n-1; i>=0; i--) {
                    swap(arr, 0, i);
                    sink(arr, i, 0);
                }
            }

            private static void sink(int[] arr, int n, int i) {
                while(true) {
                    int left = 2*i + 1;
                    int right = 2*i + 2;
                    
                    int largest = i;
                    if(right < n && arr[right] > arr[largest])
                        largest = right;
                    if(left < n && arr[left] > arr[largest])
                        largest = left;

                    if(largest != i) {
                        swap(arr, i, largest);
                        i = largest;
                    }else
                        break;
                }
            } 

### Merge Sort - O(n log(n))

        public static int[] mergesort(int[] arr) {
            int n = arr.length;
            if(n <= 1)
                return arr;
            int[] left = mergesort(Arrays.copyOfRange(arr, 0, n/2));
            int[] right = mergesort(Arrays.copyOfRange(arr, n/2, n));
            return merge(left, right);
        }

        public static int[] merge(int[] arr1, int[] arr2) {
            int[] res = new int[arr1.length+arr2.length];
            int i = 0, j = 0, k = 0;
            // Get the smaller element from the front of arr1 and arr2
            while(i < arr1.length && j < arr2.length) {
                if(arr1[i] <= arr2[j]) {
                    res[k++] = arr1[i++];
                }else {
                    res[k++] = arr2[j++];
                }
            }
            while(i < arr1.length) {
                res[k++] = arr1[i++];
            }
            while(j < arr2.length) {
                res[k++] = arr2[j++];
            }
            return res;
        }

### Quick Sort - O(n log(n))
* Process
    * Choose one element as the **pivot** and move all elements which is smaller than it the left side, bigger ones to the right side
    * Choose new pivot for the left and right side and keep doing this until all elements are sorted

            public static void quicksort(int[] arr) {
                if (arr == null) 
                    return;
                quicksort(arr, 0, arr.length - 1);
            }

            // Sort interval [lo, hi] inplace recursively
            private static void quicksort(int[] arr, int lo, int hi) {
                if (lo < hi) {
                    int splitPoint = partition(arr, lo, hi);
                    quicksort(arr, lo, splitPoint-1);
                    quicksort(arr, splitPoint+1, hi);
                }
            }

            // Performs Hoare partition algorithm for quicksort
            private static int partition(int[] arr, int lo, int hi) {
                int pivot = arr[hi];
                // See i is the seperate point between element smaller than pivot and greater than it
                int i = lo - 1, j = lo;
                while(j < hi) {
                    if(arr[j] <= pivot) {
                        swap(arr, ++i, j);
                    }
                    j++;
                }
                swap(arr, ++i, hi);
                return i;
            }

### [Bucket Sort](implementation/BucketSort.java)

        public static void bucketSort(int[] arr, final int minVal, final int maxVal) {
            if(arr == null | arr.length <= 1 | minVal == maxVal)
                return;
            int bucketNum = (maxVal-minVal) / arr.length + 1;
            List<List<Integer>> buckets = new ArrayList<>(bucketNum);
            // Create empty list for each bucket
            for(int i=0; i<bucketNum; i++) {
                buckets.add(new ArrayList<>());
            }
            // Put elements into buckets
            for(int i=0; i<arr.length; i++) {
                int idx = (i-minVal)/(maxVal-minVal);
                List<Integer> b = buckets.get(idx);
                b.add(arr[i]);
            }
            // Sort elements in each bucket and merge all buckets
            for(int i=0, k=0; i<bucketNum; i++) {
                List<Integer> b = buckets.get(i);
                if(b != null) {
                    Collections.sort(b);
                    for(int j=0; j<b.size(); j++) {
                        arr[k++] = b.get(j);
                    }
                }
            }
        }

### [Counting Sort](implementation/CountingSort.java)

        public static void countingSort(int[] arr, final int minVal, final int maxVal) {
            int size = maxVal - minVal + 1;
            int[] counting = new int[size];
            //count frequency of the number
            for(int i=0; i<arr.length; i++) {
                counting[arr[i]-minVal]++;
            }
            //fill in numbers by frequency
            for(int i=0, j=0; i<size; i++) {
                while(counting[i] > 0) {
                    arr[j++] = minVal + i;
                    counting[i]--;
                }
            }
        }

-----
### Other References
* [Sorting Algorithms by William Fiset](https://github.com/williamfiset/Algorithms)

### Related Leetcode Problems
* [Easy]  242. [Valid Anagram](https://leetcode.com/problems/valid-anagram/)
* [Easy]  349. [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
* [Easy]  350. [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
* [Easy]  922. [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)
* [Easy]  976. [Largest Perimeter Triangle](https://leetcode.com/problems/largest-perimeter-triangle/)
