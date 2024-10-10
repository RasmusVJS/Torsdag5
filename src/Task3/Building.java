package Task3;

public class Building {
    private Room[] rooms;
    private int numberOfFloors;

    Building(Room[] rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    Room[] getRooms() {
        return rooms;
    }

    int getNumberOfFloors() {
        return numberOfFloors;
    }

    void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
