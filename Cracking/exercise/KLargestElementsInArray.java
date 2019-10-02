import java.util.Arrays;

// Time complexity: O(log(n))
public class KLargestElementsInArray {
    public int[] kLargestElementsInArray(int[] arr, int num) {
        Arrays.sort(arr);
        int[] res = new int[num];
        for(int i=0; i<num; i++) {
            res[i] = arr[arr.length-1-i];
        }
        return res;
    }
}