
public class Fibonacci {
    int fibonacci(int n) {
        if(n <= 1)
            return n;
        int x = 0, y = 1, z = x + y;
        int count = 2;
        while(count < n) {
            x = y;
            y = z;
            z = x + y;
            count++;
        }
        return z;
    }


    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        for(int i=0; i<10; i++) {
            System.out.println(test.fibonacci(i));
        }
    }
}