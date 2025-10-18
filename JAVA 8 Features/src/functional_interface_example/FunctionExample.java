package functional_interface_example;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

    public static void main(String[] args) {
        // Function to convert a String to its length
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("ChatGPT")); // Output: 7
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;

        // andThen: multiply first, then add
        Function<Integer, Integer> andThenResult = multiplyBy2.andThen(add3); // (x * 2) + 3
        System.out.println("andThen: " + multiplyBy2.andThen(add3).apply(5)); // (5 * 2) + 3 = 13

        // compose: add first, then multiply
        Function<Integer, Integer> composeResult = multiplyBy2.compose(add3); // (x + 3) * 2
        System.out.println("compose: " + composeResult.apply(5)); // (5 + 3) * 2 = 16
        
        UnaryOperator<Integer> square = x -> x * x;

        System.out.println(square.apply(5)); // Output: 25
        
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println(multiply.apply(3, 4)); // Output: 12
    }
}
