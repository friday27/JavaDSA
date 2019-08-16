package binary_search;

/*
	[Easy] 744. Find Smallest Letter Greater Than Target
	
	Given a list of sorted characters letters containing only lowercase letters, 
	and given a target letter target, find the smallest element in the list that is larger than the given target.

	Letters also wrap around. 
	For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

	Input:
	letters = ["c", "f", "j"]
	target = "a"
	Output: "c"
	
 */

public class FindSmallestLetterGreaterThanTarget {
	
	public static char FindSmallestLetterGreaterThanTarget(char[] a, char x) {
		int n = a.length;
	       
        if (x >= a[n - 1])   x = a[0];
        else    x++;
        
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x)    return a[mid];
            if (a[mid] < x)     lo = mid + 1;
            else    hi = mid;
        }
        return a[hi];
	}

	public static void main(String[] args) {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		char ans = FindSmallestLetterGreaterThanTarget(letters, target);
		System.out.println(ans);

		target = 'd';
		ans = FindSmallestLetterGreaterThanTarget(letters, target);
		System.out.println(ans);
		
		target = 'g';
		ans = FindSmallestLetterGreaterThanTarget(letters, target);
		System.out.println(ans);
		
		target = 'c';
		ans = FindSmallestLetterGreaterThanTarget(letters, target);
		System.out.println(ans);
	}

}
