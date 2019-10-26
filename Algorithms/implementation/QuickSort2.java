import java.util.Random;

// http://alrightchiu.github.io/SecondRound/comparison-sort-quick-sortkuai-su-pai-xu-fa.html
public class QuickSort2 {
    public static void quicksort(int[] arr) {
        if(arr == null || arr.length <= 1)
            return;
        partition(arr, 0, arr.length-1);
    }

    // Sort interval [lo, hi] inplace recursively
    // Performs Hoare partition algorithm for quicksort
    private static void quicksort(int[] arr, int lo, int hi) {
        if(lo >= hi)
            return;
        int pivot = arr[hi], i = lo-1, j = lo;
        while(j < hi) {
            if(arr[j] <= pivot)
                swap(arr, ++i, j);
            j++;
        }
        int p = i+1;
        swap(arr, p, hi);
        partition(arr, lo, p-1);
        partition(arr, p+1, hi);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }    

    /* TESTING BELOW */
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        quicksort(array);
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
                quicksort(array);
                java.util.Arrays.sort(arrayCopy);
                if (!java.util.Arrays.equals(array, arrayCopy)) 
                    System.out.println("ERROR");
            }
    }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}