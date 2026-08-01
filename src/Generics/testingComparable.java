package Generics;
import java.util.Arrays;
public class testingComparable {

  public static void main(String[] args) {
    
    Integer a = 5;
    Integer b = 6;
    System.out.println(a.compareTo(b));

    Student henry = new Student("Henry");
    Student marry = new Student("Marry");
    System.out.println(henry.compareTo(marry));

    Student[] students = new Student[2];
    students[0] = henry;
    students[1] = marry;
    Arrays.sort(students);
    System.out.println(Arrays.toString(students));


    
  } 
}

class Student implements Comparable{

  private String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override //overriding compareTo method for T type, rather than wrapper classes such as Integer, String, Double etc.
  public int compareTo(Object o) {
    Student other = (Student) o;
    return name.compareTo(other.name);
  }
}
