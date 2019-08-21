// Brilliant solution!!
// https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> stack = new Stack<Integer>();
        for(int num: nums2) {
            // If find the next greater number, add it to map
            while(!stack.empty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for(int i=0; i<nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}