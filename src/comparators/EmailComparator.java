package comparators;

import mapDemo.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getEmail().compareTo(customer2.getEmail());
    }
    public static void showSortedOjects(){
        Customer  customer1 = new Customer("Konlan", "konlan.mikpekoah@turntabl.com");
        Customer customer2 = new Customer("Aisha", "aisha.nasir@turntabl.com");
        Customer customer3 = new Customer("Amin", "amin.adams@turntabl.com");
        List<Customer> customers =new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }

    public static void main(String[] args) {
        showSortedOjects();
    }
}
