
public class Elevator {
    public enum Direction {
        UP, DOWN, NONE;
    }

    private Direction direction = Direction.NONE;

    private int currentFloor;

    Elevator() {
        this.currentFloor = 1;
    }

    void move(int floor) {
        this.currentFloor = floor;
        open();
        close();
    }

    void open() {
        System.out.println("Door opened at "+this.currentFloor+" floor.");
    }

    void close() {
        System.out.println("Door closed at "+this.currentFloor+" floor.");
    }
}