package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  record Person(String firstName, String lastName) {

    @Override
    public String toString() {
      return firstName +  " " + lastName;
    }
  }
  public static void main(String[] args) {

    List<Person> people = new ArrayList<>(Arrays.asList(
      new Person("Hakan", "G"), new Person("Henry", "Cavil"),
      new Person("Alan", "Ritchson")
    ));

    // using anonymous class
    var comparatorLastName = new Comparator<Person>() {

      @Override
      public int compare(Person o1, Person o2) {
        return o1.lastName().compareTo(o2.lastName());
      }
    };
    people.sort(comparatorLastName);
    System.out.println(people);

    // ya da direkt sort fonksiyonunun içinde tanımlayabiliriz
    /*people.sort(new Comparator<Person>() {

      @Override
      public int compare(Person o1, Person o2) {
        return o1.lastName().compareTo(o2.lastName());
      }
    });
    System.out.println(people);*/

    //ya da lambda expression ile 
    /*people.sort((o1,o2) -> o1.lastName().compareTo(o2.lastName()));
    System.out.println(people);*/

    //@FunctionalInterface functional interface olduğunu kontrol etmek için kullanılır
    interface EnhancedComparator<T> extends Comparator<T> {

      int secondLevel(T o1, T o2); //abstract method
    }

    //2nd anonymous class, can not be converted to lambda, since there are 2 methods
    var comparatorMixed = new EnhancedComparator<Person>() {

      @Override
      public int compare(Person o1, Person o2) {
        int result = o1.lastName().compareTo(o2.lastName());
        return result == 0 ? secondLevel(o1, o2) : result;
      }

      @Override
      public int secondLevel(Person o1, Person o2) {
        return o1.firstName().compareTo(o2.firstName());
      }
      
    };

    people.sort(comparatorMixed); 
    System.out.println(people);
    
    
  }
  
}
