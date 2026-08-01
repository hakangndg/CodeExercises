package Nested_Classes_Local_Types_Anonymous_Classes.StaticNestedClasses;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    
    List<Employee> list = new ArrayList<>(List.of(new Employee(123,"Hakan",2026),
    new Employee(124,"Zeynep",2021), new Employee(125,"Furkan",2025)
    ,new Employee(126,"Cansu",2026)));

    var comparator = new Employee.EmployeeComparator<>(); //Employee. usage ensures we are using the function
    // in the nested class
    list.sort(comparator);

    for (Employee employee : list) {
      System.out.println(employee);
    }
  }

}
