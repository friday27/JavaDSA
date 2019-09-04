class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sqrSum, remain;
        while(set.add(n)) {
            sqrSum = 0;
            while(n > 0) {
                remain = n % 10;
                sqrSum += remain*remain;
                n /= 10;
            }
            if(sqrSum == 1)
                return true;
            else
                n = sqrSum;
        }
        return false;
    }
}