package Task2;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        for (String i : cafe.getCoffeMenu())
            System.out.println(i);
    }
}
