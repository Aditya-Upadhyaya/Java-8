package functional_interface_example;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) throws Exception {
       
       /* 
        * Imperative - how style of programming
        */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Sum throught imprative - " + sum);
        /* 
        * Declarative - what style of programming
        */
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum through declarative - "+ sum1);

    }
}
