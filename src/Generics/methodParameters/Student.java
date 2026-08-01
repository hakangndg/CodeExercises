package Generics.methodParameters;

import java.util.Random;

public class Student {

  private String name;
  private String course;
  private int yearStarted;

  protected static Random random = new Random();

  private String[] names = {"Jack", "Marry", "Henry", "Roscoe", "Dixon"};
  private String[] courses = {"Java", "C", "Python", "postgreSQL"};

  public Student() {
    this.name = names[random.nextInt(0,5)];
    this.course = courses[random.nextInt(0,4)];
    this.yearStarted = random.nextInt(2000,2026);
  }

  @Override
  public String toString() {
    return "Name: " + name +" - Course: " + course + " - starting year: " + yearStarted;
  }
  
}
