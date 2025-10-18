package functional_interface_example;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> multipleOfTwo = (a)->{ return a%2==0;};
        Predicate<Integer> multipleOf5 = (a)->{ return a%5==0;};
        System.out.println(multipleOfTwo.and(multipleOf5).test(45));
    }
}
