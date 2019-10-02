import java.util.*;

// Find if there exists 3 numbers in an array so that a^2 + b^2 = c^2
public class PythagorenTriplet {
    // method 1: 3 loops -> time complexity: O(n^3)
    // ...

    // method 2: Arrays.sort() + 2 loops -> O(n^2)
    public boolean pythagorenTriplet(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        for(int i=arr.length-1; i>1; i--) {
            int a = 0, b = i-1;
            while(a < b) {
                if(arr[a]+arr[b] == arr[i])
                    return true;
                if(arr[a]+arr[b] < arr[i])
                    a++;
                else
                    b--;
            }
        }
        return false;
    }

    // method 3: HashMap -> O(n^2)
    public boolean pythagorenTriplet3(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i]*arr[i]);
        }
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int tmp = arr[i]*arr[i] + arr[j]*arr[j];
                if(map.containsKey(tmp))
                    return true;
            }
        }
        return false;
    }
}