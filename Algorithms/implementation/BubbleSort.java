import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=arr.length-1; j>i; j--) {
                if(arr[j] < arr[j-1])
                    arr = swap(arr, j, j-1);
            }
        }
    }

    private static int[] swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
        bubbleSort(array);
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
            bubbleSort(array);
            java.util.Arrays.sort(arrayCopy);
            if (!java.util.Arrays.equals(array, arrayCopy)) 
                System.out.println("ERROR");
            }
        }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}