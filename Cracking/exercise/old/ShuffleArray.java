import java.util.*;

public class ShuffleArray {
    public static int[] shuffle(int[] array) {
        Random rgen = new Random();
        for(int i=0; i<array.length; i++) {
            int randIdx = rgen.nextInt(array.length);
            //swap
            int tmp = array[i];
            array[i] = array[randIdx];
            array[randIdx] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        // method 1. Collectios.shuffle() -> O(n)
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8,9};
        List<Integer> arrayList = Arrays.asList(arr1);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        // method 2. Shuffle elements in an array
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] res = shuffle(arr2);
        for(int r: res)
            System.out.print(r+" ");
        System.out.println();
    }
}