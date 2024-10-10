package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Cafe {
    private ArrayList<String> coffeMenu = new ArrayList<>();

    ArrayList<String> getCoffeMenu(){
        return coffeMenu;
    }

    void loadMenuData(){
        File file = new File("coffees.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                coffeMenu.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
