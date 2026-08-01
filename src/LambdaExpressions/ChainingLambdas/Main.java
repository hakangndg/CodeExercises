package LambdaExpressions.ChainingLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    String name = "Alan";
    Function<String, String> uCase = String::toUpperCase;
    System.out.println(uCase.apply(name));

    Function<String, String> lastName = s -> s.concat("Ritchson");
    Function<String,String> uCaseLastName = uCase.andThen(lastName); //execute the uCase first, and then the lastName   
    System.out.println(uCaseLastName.apply(name));  

    uCaseLastName = uCase.compose(lastName); //it will execute lastName first, and then the uCase method
    System.out.println(uCaseLastName.apply(name));

    Function<String, String[]> f0 = uCase.andThen(s -> s.concat(" Cavill"))
                                         .andThen(s -> s.split(" "));

    String henry = "Henry";
    System.out.println(Arrays.toString(f0.apply(henry)));      
    
    String names[] = {"Henry","Reacher","Roscoe", "Finlay"};
    Consumer<String> s0 = s -> System.out.print(s.charAt(0));
    Consumer<String> s1 = System.out::println;
    Arrays.asList(names).forEach(s0.andThen(s -> System.out.print(" - ")).andThen(s1));

    Predicate<String> p1 = s -> s.equals("TİM");
    Predicate<String> p2 = s -> s.equalsIgnoreCase("tim");
    Predicate<String> p3 = s -> s.startsWith("T");
    Predicate<String> p4 = s -> s.endsWith("e");
    Predicate<String> combined1 = p1.or(p2);
    String name2 = "tim";
    System.out.println("combined1 = " + combined1.test(name));
    System.out.println("combined1 = " + combined1.test(name2));
    Predicate<String> combined2 = p3.and(p4).negate(); //negate prints out the opposite
    System.out.println(combined2.test(name2));

    record Person(String name, String lastName) {}
    
    List<Person> list = new ArrayList<>(Arrays.asList(
      new Person("Peter", "Pan"),
      new Person("Peter", "Pumpkineater"),
      new Person("Minnie", "Mouse"),
      new Person("Mickey", "Mouse")
    ));

    list.sort((o1,o2) -> o1.lastName.compareTo(o2.lastName));
    list.forEach(System.out::println);

    System.out.println("-------------------------");

    list.sort(Comparator.comparing(Person::lastName));
    list.forEach(System.out::println);

    System.out.println("-------------------------");

    list.sort(Comparator.comparing(Person::lastName).thenComparing(Person::name));
    list.forEach(System.out::println);
  }

  
  
}
