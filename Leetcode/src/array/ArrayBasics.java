package array;

public class ArrayBasics {

	public static void main(String[] args) {
		
		//Initialization 1
		int[] carArray = new int[4000];
		//Unless you specify otherwise, an array of integers is automatically initialized to 0 
		//when it’s created.
		for(int i=0; i<5; i++)	System.out.println("carArray["+i+"] = "+carArray[0]);
		
		//Initialization 2
		int[] intArray = { 0, 3, 6, 9, 12, 15, 18, 21, 24, 27 };
		
		int[] test = new int[100];
		System.out.println(test.length);

	}

}
