import java.util.Random;

public class BinarySearch {
    int binarySearch(int[] arr, int n) {
        if(arr == null || arr.length == 0)
            return -1;
        return binarySearch(arr, n, 0, arr.length-1);
    }

    int binarySearch(int[] arr, int n, int start, int end) {
        if(start >= end) {
            if(arr[start] == n)
                return start;
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == n)
            return mid;
        else if(arr[mid] > n)
            return binarySearch(arr, n, start, mid-1);
        else
            return binarySearch(arr, n, mid+1, end);
    }

    /* TESTING BELOW */
    public static void main(String[] args) {
        BinarySearch test = new BinarySearch();
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        test.binarySearch(array, 6);
        System.out.println(java.util.Arrays.toString(array));
        runTests(test);
    }

    static Random RANDOM = new Random();

    public static void runTests(BinarySearch test) {
        final int NUM_TESTS = 100;
        for (int i = 1; i <= NUM_TESTS; i++) {
            int[] array = new int[i];
            for (int j = 0; j < i; j++) array[j] = randInt(-1000000, +1000000);
                int[] arrayCopy = array.clone();
                int ranIdx = randInt(0, i);
                int ranNum;
                if(ranIdx >= arrayCopy.length)
                    ranNum = randInt(-1000000, +1000000);
                else
                    ranNum = arrayCopy[ranIdx];

                int res = test.binarySearch(array, ranNum);
                System.out.println("find "+ranNum+" in ");
                for(int k=0; k<arrayCopy.length; k++)
                    System.out.print(arrayCopy[k]+" ");
                System.out.print(" -> "+res+"\n");
            }
    }

    static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}