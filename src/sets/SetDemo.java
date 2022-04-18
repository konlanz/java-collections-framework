package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void showSetDemo(){
        Set<Integer> numbers = new HashSet<>();
        //You can add element to a set
        numbers.add(1);
        System.out.println(numbers);

        Set<Integer> evenNumbers = new HashSet<>(Arrays.asList(2, 4, 6,  8));
        Set<Integer> oddNumbers = new HashSet<>(Arrays.asList(1,3,5,7,9));
        //You can do a union
        numbers.addAll(evenNumbers);
        numbers.addAll(oddNumbers);
        System.out.println(numbers);

        //you can perform an intersection on two sets
        numbers.retainAll(evenNumbers);
        System.out.println(numbers);

        //you can get the distinct values of the two sets

        numbers.retainAll(oddNumbers);
        System.out.println(numbers);





   }

    public static void main(String[] args) {
        showSetDemo();
    }
}
