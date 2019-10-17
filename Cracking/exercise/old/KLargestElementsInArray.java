import java.util.*;

public class KLargestElementsInArray {
    // Time complexity: O(n log(n))
    // Arrays.sort() -> O(n log n) on avg, O(n^2) for the worst case
    public void kLargestElementsInArray(int[] arr, int num) {
        Arrays.sort(arr);
        int[] res = new int[num];
        for(int i=0; i<num; i++) {
            res[i] = arr[arr.length-1-i];
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    // Time complexity: O(n log n)
    // Use min heap and convert it to a max heap by multiple every element by -1
    public void kLargestElementsInArray2(int[] arr, int num) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr)
            pq.offer(i*-1);
        int[] res = new int[num];
        for(int i=0; i<num; i++) {
            res[i] = pq.poll()*-1;
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        KLargestElementsInArray test = new KLargestElementsInArray();
        int[] input = {6, -100, 78, 27, 666, 12, 0};
        test.kLargestElementsInArray(input, 3);
        test.kLargestElementsInArray2(input, 3);
    }
}