package sorting;

public class MergeSorting {
	
	//Top down
	public static int[] MergeSorting(int[] arr) {
		if(arr.length==1) return arr;
		int sep = arr.length / 2;
		int[] left = MergeSorting(arr[0:sep]);
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		int size = 0;
		int point1 = 0, point2 = 0;
		while(point1<arr1.length && point2<arr2.length) {
			if(arr1[point1]<arr2[point2]) {
				result[size] = arr1[point1];
				point1++;
			}else {
				result[size] = arr2[point2];
				point2++;
			}
			size++;
		}
		
		if(point1!=arr1.length) {
			for(int p=point1;p<arr1.length;p++) {
				result[size] = arr1[p];
				size++;
			}
		}else {
			for(int p=point2;p<arr2.length;p++) {
				result[size] = arr2[p];
				size++;
			}
		}
		return result;
	}
	
	//Bottom up
	public static void MergeSorting2(int[] arr) {
		
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2}; //1,2,7,83
		int[] arr2 = {7,83};
		int[] ans = merge(arr1, arr2);
		for(int a:ans) System.out.print(a+" ");
	}

}
