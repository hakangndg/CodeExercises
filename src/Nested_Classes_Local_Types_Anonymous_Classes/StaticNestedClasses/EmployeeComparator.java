package Nested_Classes_Local_Types_Anonymous_Classes.StaticNestedClasses;
import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
