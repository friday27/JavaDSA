
public class MagicIndex {
    int getMagicIndex(int[] arr) {
        if(arr == null || arr.length == 0)
            return -1;
        return getMagicIndex(arr, 0, arr.length-1);
    }

    private int getMagicIndex(int[] arr, int start, int end) {
        if(start > end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == mid)
            return mid;
        else if(arr[mid] < mid)
            return getMagicIndex(arr, mid+1, end);
        else
            return getMagicIndex(arr, start, mid-1);
    }

    public static void main(String[] args) {
        MagicIndex test = new MagicIndex();
        int[] arr = {1,2,3,4,5,6};

    }
}