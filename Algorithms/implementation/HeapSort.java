import java.util.*;

public class HeapSort {
    public static void heapSortWithPQ(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        for(int i: arr)
            pq.offer(i);
        for(int i=0; i<arr.length; i++) {
            arr[i] = pq.poll();
        }
    }

    public static void heapSortWithPQ2(int[] arr) {
        if(arr.length <= 1)
            return;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: arr)
            pq.offer(n);
        int i = 0;
        while(!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
    }

    public static void heapSort(int[] arr) {
        if(arr == null)
            return;

        int n = arr.length;
        // convert an array to a binary heap, O(n)
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

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        heapSort(array);
        System.out.println(java.util.Arrays.toString(array));

        runTests();
    }

    static Random RANDOM = new Random();

    public static void runTests() {
        final int NUM_TESTS = 1000;
        for (int i = 1; i <= NUM_TESTS; i++) {

            int[] array = new int[i];
            for (int j = 0; j < i; j++) array[j] = randInt(-1000000, +1000000);
                int[] arrayCopy = array.clone();

                // heapSort(array);
                heapSort2(array);
                // heapSortWithPQ(array);
                // heapSortWithPQ2(array);
                java.util.Arrays.sort(arrayCopy);

                if (!java.util.Arrays.equals(array, arrayCopy)) {
                    System.out.println("ERROR");
                    System.out.println("output:\t"+java.util.Arrays.toString(array));
                    System.out.println("expected:\t"+java.util.Arrays.toString(arrayCopy));
                }
            }
        }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}