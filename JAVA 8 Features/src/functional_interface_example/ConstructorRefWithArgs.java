package functional_interface_example;

import java.util.function.BiFunction;
import java.util.function.Supplier;

class Person {

    Person() {
        System.out.println("Person created!");
    }
}

class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee: " + name + ", Age: " + age);
    }
}

public class ConstructorRefWithArgs {

    public static void main(String[] args) {
        BiFunction<String, Integer, Employee> empCreator = Employee::new;
        Employee e = empCreator.apply("Alice", 30);
        //Employee: Alice, Age: 30

        Supplier<Person> personSupplier  = Person::new;
        personSupplier.get();
        //Person created!
    }
}
