/*This is a function problem.You only need to complete the function given below*/
class Reverse {
    public static void reverseWords(String sd) {
        String[] strs = sd.split("\\.");
        if(strs.length <= 1) {
            System.out.print(sd);
            return;
        }
        for(int i=0; i<strs.length/2; i++) {
            swap(strs, i, strs.length-1-i);
        }
        for(int i=0; i<strs.length-1; i++) {
            System.out.print(strs[i]+".");
        }
        System.out.print(strs[strs.length-1]);
    }
    static void swap(String[] strs, int i, int j) {
        String tmp = strs[i];
        strs[i] = strs[j];
        strs[j] = tmp;
    }
}