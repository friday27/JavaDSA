// Runtime: 2 ms, faster than 99.68%
// Memory Usage: 40.8 MB, less than 96.30%
class Solution {
    int[] arr;
    
    public int[] sortArrayByParityII(int[] A) {
        this.arr = A;
        int i = 0, j = 1, n = A.length;        
        while(i < n && j < n) {
            while(i < n && arr[i]%2 == 0)
                i += 2;
            while(j < n && arr[j]%2 == 1)
                j += 2;
            if(i < n && j < n)
               swap(i, j);
        }
        return arr;
    }
    
    private void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

// Runtime: 7 ms, faster than 14.08%
// Memory Usage: 41.4 MB, less than 92.59%
class Solution {
    int[] arr;
    
    public int[] sortArrayByParityII(int[] A) {
        this.arr = A;
        Stack<Integer> odd = new Stack<Integer>();
        Stack<Integer> even = new Stack<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(i%2 != arr[i]%2) {
                if(i%2 == 0) {
                    if(!even.isEmpty())
                        swap(i, even.pop());
                    else
                        odd.push(i);
                }else {
                    if(!odd.isEmpty())
                        swap(i, odd.pop());
                    else
                        even.push(i);
                }
            }
        }
        return arr;
    }
    
    private void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}