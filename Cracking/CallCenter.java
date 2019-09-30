
class Person {
    boolean isBusy = false;

    boolean assign() {
        if(isBusy == true)
            return false;
        isBusy = true;
        return true;
    }

    void finish() {
        isBusy = false;
    }
}

class respondent extends Person {
}

class manager extends Person {
}

class director extends Person {

}

class Call {
    int id;
    int time;
}

public class CallCenter {
    private final int numRespondent = 16; 
    private final int numManager = 4;
    private final int numDirector = 2;

    Queue<Call> callQueue = new LinkedList<Call>();

    public Person dispatchCall(Call call) {

    }

}