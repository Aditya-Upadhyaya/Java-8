package functional_interface_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void implementConsumer(){
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("Consumer");
        Consumer<String> c1 = (str) -> System.out.println(str);
        Consumer<String> c2 = (str) -> System.out.println(str.toLowerCase());
        list.forEach(c1.andThen(c2));
    }

    
    public static void main(String[] args) {
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        greet.accept("Alice");

        System.out.println("******************");
        implementConsumer();
    }
}
