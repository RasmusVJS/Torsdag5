package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Rasmus", "Svendsen", "RasmusVJS");
        customers.add(customer1);
        Customer customer2 = new Customer("Jonas", "Svendsen", "JonasAJS");
        customers.add(customer2);
        Customer customer3 = new Customer("Mikkel", "Svendsen", "MikkelBJS");
        customers.add(customer3);
        printCustomers(customers);
    }

    static void printCustomers(ArrayList customers){
        if (customers != null && !customers.isEmpty()){
            for (Object i : customers) {
                System.out.println(i.toString());
            }
        }
    }
}
