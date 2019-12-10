
class ElevatorController {
    private Elevator elevator;

    void start() {
        this.elevator = new Elevator();
    }

    void reset() {
        start();
    }

    void shutdown() {
        this.elevator = null;        
    }
}
