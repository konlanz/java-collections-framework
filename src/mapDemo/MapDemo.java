package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

public static void showMapDemo(){
    Customer  customer1 = new Customer("Konlan", "konlan.mikpekoah@turntabl.com");
    Customer customer2 = new Customer("Aisha", "aisha.nasir@turntabl.com");
    Customer customer3 = new Customer("Amin", "amin.adams@turntabl.com");

    Map<String, Customer> customerMap = new HashMap<>();

    customerMap.put(customer1.getEmail(), customer1);
    customerMap.put(customer2.getEmail(), customer2);
    customerMap.put(customer3.getEmail(), customer3);
    // get a customer
    Customer customer =  customerMap.get("amin.adams@turntabl.com");
    System.out.println(customer);
    //check if a customer exist by key
    var customerExist = customerMap.containsKey("hello@gmail.com");
    System.out.println(customerExist);

    //replace a customer by key
    customerMap.replace("konlan.mikpekoah@turntabl.com", new Customer("prince mensa", "prince.mensa@turntable.com"));
    System.out.println(customerMap);

    //you can iterate through the key
    for (var key :customerMap.keySet()) {
       System.out.println(key);
    }

    // you can iterate to get only values
    for (var value:customerMap.values()) {
        System.out.println(value);
    }

    //you can iterate through the map
    for (var entry : customerMap.entrySet()
         ) {
        System.out.println(entry);
    }


}

    public static void main(String[] args) {
        showMapDemo();
    }

}
