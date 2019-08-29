class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return new int[0];
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                arr.add(nums1[i++]);
                j++;
            }else if(nums1[i] < nums2[j]) {
                i++;
            }else {
                j++;
            }
        }
        
        int[] res = new int[arr.size()];
        int k = 0;
        for(Integer n: arr)
            res[k++] = n;
        return res;
    }   
}