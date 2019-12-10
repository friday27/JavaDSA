
abstract class Button {
    private boolean lightOn;

    Button() {
        this.lightOn = false;
    }

    void illuminate() {
        this.lightOn = true;
    }

    void doNotIlluminate() {
        this.lightOn = false;
    }

    void placeRequest(ElevatorRequest r, int floor) {
        r.add(floor);
    }
}