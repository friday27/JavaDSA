class Solution {
    public int getInt(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
        
    public int romanToInt(String s) {
        int len = s.length();
        int[] temp = new int[len];
        
        for(int i=len-1; i > -1; i--) {
            temp[len-i-1] = getInt(s.charAt(i));
        }
        
        int sum = temp[0], t;
        for(int j=1; j<len; j++) {
            t = temp[j];
            if(t < temp[j-1]) {
                t *= -1;
            }
            sum += t;
        }
        return sum;
    }
}