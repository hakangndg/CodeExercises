package Generics.methodParameters;
import java.util.*;

public class Main {

  public static void main(String[] args) {


    List<Student> listOfStudents = new ArrayList<>();
    List<lpaStudent> listOfLpaStudents = new ArrayList<>();

    for (int i = 0; i < 3 ; i++) {
      listOfStudents.add(new Student()) ;
    }

    for (int i = 0; i < 3 ; i++) {
      listOfLpaStudents.add(new lpaStudent());
    }
    
    printList(listOfStudents);
    printList(listOfLpaStudents);
  }

  public static <T extends Student> void printList(List<T> list) { // List<Student> // solution : GENERIC METHOD
    //with "extend students" I can only pass Students and subclasses of Students
  //  usage cause compile error, can not insert apple bowl when the function requires fruit bowl for instance
    for (var student : list) {
      System.out.println(student.toString());
    }
    System.out.println();
  }

  /*
  List<?> UNBOUNDED: a list of any type can be passed.
  List<? extends Student>: a list of Student or subclasses of student can be passed.
  List<? super LPAStudent>: a list containing type that is LPAStudent or a super types(Student) can be passed.
  
  
  
  */

 

  
}
