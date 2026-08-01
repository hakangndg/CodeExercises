package Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    
    Collection<String> list = new TreeSet<>(); //treeset could be also hashset but insertion order would be different
    String names[] = {"Anna", "Bob", "Carol", "David", "Edna"};
    list.addAll(Arrays.asList(names));
    System.out.println(list);

    list.add("Fred");
    list.addAll(Arrays.asList("George", "Gary", "Grace"));
    System.out.println(list);
    System.out.println("is Gary in the list ? : " + list.contains("Gary"));

    list.removeIf(s -> s.charAt(0) == 'G');
    System.out.println(list);
    //list.sort(); sort method is not defined for the collection interface
  }
  
}
