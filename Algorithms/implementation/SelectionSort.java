import java.util.Random;

public class SelectionSort {
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

    public static void selectionSort2(int[] arr) {
        if(arr.length <= 1)
            return;
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
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
        selectionSort(array);
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

                // selectionSort(array);
                selectionSort2(array);
                java.util.Arrays.sort(arrayCopy);

            if (!java.util.Arrays.equals(array, arrayCopy))  {
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