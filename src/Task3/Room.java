package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    int getNumberOfLamps() {
        return numberOfLamps;
    }

    int getNumberOfWindows() {
        return numberOfWindows;
    }

    void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
