package functional_interface_example;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {

    public static Function<String, String> lamdaEx = (str)-> str.toUpperCase();
    public static Function<String, String> methodrefExample = String::toUpperCase;
     
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println(methodrefExample.apply("java"));
        //Output - JAVA

        Consumer<String> printer = MethodReferenceExample::printMessage;
        printer.accept("Hello from static method reference!");
        //Output - Hello from static method reference!
    }
}
