package Nested_Classes_Local_Types_Anonymous_Classes.StaticNestedClasses;

import java.util.Comparator;

public class Employee {


  //Using nested class to override and directly accessing to private field of the employee class
  public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    return o1.startedYear - o2.startedYear;
  }
}

  private int ID;
  private String name;
  private int startedYear;

  public Employee(int iD, String name, int startedYear) {
    ID = iD;
    this.name = name;
    this.startedYear = startedYear;
  }

  public Employee() {

  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "%d %-8s %d".formatted(ID, name,startedYear);
  }
  

}
