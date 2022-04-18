package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void showList(){
        List<Integer> numbers = new ArrayList<>();
        //You can add one item to the list;
        numbers.add(1);

        //you van add multiple values
        Collections.addAll(numbers, 2, 3, 4, 5, 6, 7, 8,9);
        System.out.println(numbers);

        //you can insert an item at a particular point in the list
        numbers.add(0, 0);
        System.out.println(numbers);

        // you can get an element
        System.out.println(numbers.get(2));

        // you can set a value to and index
        numbers.set(9, 10);
        System.out.println(numbers);
        //you can remove an item from and index.
        numbers.remove(9);
        System.out.println(numbers);

        //you can search for the index of a value. but this return the first index of 8 you can use the lastIndexOf to get the last index
        System.out.println(numbers.indexOf(8));

        //you can create a new list of sublist from a lis
        System.out.println(numbers.subList(2,6));
    }

    public static void main(String[] args) {
        showList();
    }
}
