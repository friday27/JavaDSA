/*
    https://www.geeksforgeeks.org/the-stock-span-problem/
    span = 1 + the number of values smaller than it continuously
*/

public class StockSpan {
    public static int[] calStackSpan(int[] prices) {
        int[] res = new int[prices.length];
        for(int i=0; i<prices.length; i++) {
            res[i] = 1;
            int j = i-1;
            while(j > -1 && prices[j] < prices[i]) {
                res[i]++;
                j--;
            }
        } 
        return res;
    }

    public static void main(String[] args) {
        int[] test = {8, 9, 10, 4, 5, 6, 8};
        int[] res = calStackSpan(test);
        for(int i: res)
            System.out.print(i+" ");
        System.out.println();
    }
}