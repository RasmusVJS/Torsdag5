package Task3;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4,1);
        Room room2 = new Room(2,3);
        Room room3 = new Room(4,3);
        Room[] roomArray = {room1, room2, room3};
        Building building = new Building(roomArray, 2);
        System.out.println(countLampsInBuilding(building));
        System.out.println(countWindowsInBuilding(building));
        System.out.println(countRoomsInBuilding(building));
        System.out.println(isNormal(building));
        Building building1 = new Building(roomArray, 3);
        System.out.println(isNormal(building1));
    }

    static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= countRoomsInBuilding(building);
    }

    static int countLampsInBuilding(Building building) {
        int count = 0;
        for (Room i : building.getRooms()) {
            count += i.getNumberOfLamps();
        }
        return count;
    }

    static int countWindowsInBuilding(Building building) {
        int count = 0;
        for (Room i : building.getRooms()) {
            count += i.getNumberOfWindows();
        }
        return count;
    }

    static int countRoomsInBuilding(Building building) {
        return building.getRooms().length;
    }
}
