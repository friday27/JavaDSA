// Runtime: 30 ms, faster than 52.48%
// Memory Usage: 38.2 MB, less than 98.57%
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, -1);
            }else {
                map.put(c, i);
            }
            i++;
        }
        int res = Integer.MAX_VALUE;
        for(char k: map.keySet()) {
            int v = map.get(k);
            if(v != -1 && v < res)
                res = v;
        }
        if(res == Integer.MAX_VALUE)
            return -1;
        else
            return res;
    }
}