import java.util.*;

public class ElevatorRequest {
    private Queue<Integer> requests;

    ElevatorRequest() {
        this.requests = new LinkedList<>();
    }

    public void add(int floor) {
        this.requests.offer(floor);
        process();
    }

    public int next() {
        return this.requests.poll();
    }

    private void process() {

    }
}