package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void showCollection(){
        Collection<Integer> numbers =  new ArrayList<>();

        //you can add one element to a collection
        numbers.add(0);

        //you can add many elements to the collection
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9);
        System.out.println(numbers);

        //You can iterate over a collection, because it implements the Iterable interface
        for (var number: numbers) {
           System.out.println(number);
        }

        //you can see the size of the collection
        System.out.println(numbers.size());

        //you can remove an element in a collection
        numbers.remove(9);
        System.out.println(numbers);

        //you check to see an item exist in the collection
        var numberExist = numbers.contains(8);
        System.out.println(numberExist);

        //You can copy one collection to the other.
        Collection<Integer> numbersCopy  = new ArrayList<>();
        numbersCopy.addAll(numbers);
        System.out.println(numbersCopy);
        // you can check to see if they are equal
        System.out.println(numbersCopy.equals(numbers));

    }

    public static void main(String[] args) {
        showCollection();
    }
}
