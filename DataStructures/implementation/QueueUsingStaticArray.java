public class QueueUsingStaticArray {
    int[] arr;
    int head = -1;
    int tail = -1;

    public QueueUsingStaticArray() {
        arr = new int[10];
    }

    public QueueUsingStaticArray(int size) {
        arr = new int[size];
    }

    public int size() {
        if(empty())
            return 0;
        return tail-head+1;
    }

    public boolean empty() {
        return head == -1 && tail == -1;
    }

    public int peek() {
        if(empty())
            throw new RuntimeException("Empty Queue");
        return arr[head];
    }

    public void enqueue(int val) {
        // If the arr is full, create a new arr with double size and copy the original items.
        if(tail == arr.length-1) {
            int[] newArr = new int[arr.length*2];
            for(int i=head; i<=tail; i++) {
                newArr[i-head] = arr[i];
            }
            tail = tail - head;
            head = 0;
            arr = newArr;
        }
        arr[++tail] = val;
        if(tail == 0)
            head = 0;
    }

    public int dequeue() {
        if(empty())
            throw new RuntimeException("Empty Queue");
        return arr[head++];
    }

    public static void main(String[] args) {
        QueueUsingStaticArray test = new QueueUsingStaticArray();
        for(int i=0; i<10; i++)
            test.enqueue(i*5);
        test.enqueue(-1);
        System.out.println(test.dequeue());
        System.out.println(test.size());
        System.out.println(test.empty());
        System.out.println(test.peek());   
    }
}
