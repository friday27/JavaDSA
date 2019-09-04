// Time Complexity: O(nlog(n)), Runtime: 5 ms, faster than 96.03%
// Memory: O(1), Memory Usage: Memory Usage: 41.7 MB, less than 99.14%
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}

// Time Complexity: O(n), Runtime: 6 ms, faster than 81.78%
// Memory: O(n), Memory Usage: 43.9 MB, less than 63.79%
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums) {
            if(!set.add(n))
                return true;
        }
        return false;
    }
}