import java.util.*;

public class MergeSort2 {
    public static int[] mergesort(int[] arr) {
        if(arr == null || arr.length <= 1)
            return arr;
        return mergesort(arr, 0, arr.length-1);
    }

    private static int[] mergesort(int[] arr, int start, int end) {
        if(start >= end)
            return Arrays.copyOfRange(arr, start, start+1);
        int mid = start + (end-start)/2;
        int[] left = mergesort(arr, start, mid);
        int[] right = mergesort(arr, mid+1, end);
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] <= arr2[j])
                res[k++] = arr1[i++];
            else
                res[k++] = arr2[j++];
        }
        while(i < arr1.length) {
            res[k++] = arr1[i++];
        }
        while(j < arr2.length) {
            res[k++] = arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        array = mergesort(array);
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
                array = mergesort(array);
                java.util.Arrays.sort(arrayCopy);
            if (!java.util.Arrays.equals(array, arrayCopy)) 
                System.out.println("ERROR");
        }
    }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}