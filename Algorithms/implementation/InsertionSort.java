import java.util.Random;

public class InsertionSort {
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

    public static void insertionSort2(int[] arr) {
        if(arr.length <= 1)
            return;
        for(int i=0; i<arr.length-1; i++) {
            int j = i + 1;
            while(j > 0 && arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    private static int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public static void main(String[] args) {

        int[] array = {10, 4, 6, 8, 13, 2, 3};
        // insertionSort(array);
        insertionSort2(array);
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

                // insertionSort(array);
                insertionSort2(array);
                java.util.Arrays.sort(arrayCopy);

                if (!java.util.Arrays.equals(array, arrayCopy)) {
                    System.out.println("ERROR");
                    // System.out.println("output:\t"+java.util.Arrays.toString(array));
                    // System.out.println("expected:\t"+java.util.Arrays.toString(arrayCopy));
                }
            }
        }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}