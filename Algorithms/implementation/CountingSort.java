public class CountingSort {
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

    public static void countingSort2(int[] arr, int lower, int upper) {
        int[] count = new int[upper-lower+1];
        for(int n: arr)
            count[n-lower]++;
        int i = 0;
        for(int j=0; j<count.length; j++) {
            while(count[j] > 0) {
                arr[i++] = lower+j;
                count[j]--;
            }
        }
    }

    public static void main(String[] args) {
        // The maximum and minimum values on the numbers we are sorting.
        // You need to know ahead of time the upper and lower bounds on
        // the numbers you are sorting for counting sort to work.
        final int MIN_VAL = -10;
        final int MAX_VAL = +10;

        int[] nums = {+4, -10, +0, +6, +1, -5, -5, +1, +1, -2, 0, +6, +8, -7, +10};
        countingSort2(nums, MIN_VAL, MAX_VAL);

        // prints [-10, -7, -5, -5, -2, 0, 0, 1, 1, 1, 4, 6, 6, 8, 10]
        System.out.println(java.util.Arrays.toString(nums));
    }
}