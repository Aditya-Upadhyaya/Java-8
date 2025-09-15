package functional_interface_example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept("Hello", "World");

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Math", 90);
        scores.put("English", 85);
        scores.put("Science", 95);

        BiConsumer<String, Integer> printEntry = (subject, score) ->
            System.out.println(subject + ": " + score);

        // Use BiConsumer to iterate and print map entries
        scores.forEach(printEntry);
        // Output:
        // Math: 90
        // English: 85
        // Science: 95
    }
}
