package sorting;

/*
 * The worst case: O(n^2)
 */

public class InsertionSorting {
	
	public static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
			System.out.print(i+" run: ");
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = {9,2,4,8,9,3,4567,2,565,35};
		InsertionSort(arr);
	}

}
