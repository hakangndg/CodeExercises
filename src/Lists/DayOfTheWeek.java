package Lists;

import java.util.Random;

public enum DayOfTheWeek {

  SUN, MON, TUES, WED, THURS, FRI, SAT

}

class Main{


  public static void main(String[] args) {

    DayOfTheWeek weekDay = DayOfTheWeek.TUES;
    System.out.println(weekDay);

    System.out.println(weekDay.name() + " " + weekDay.ordinal());

    for (int i = 0 ; i < 3 ; i++){
      System.out.println(i + ". random day is " + getRandomDay());
    }

    DayOfTheWeek randomDay = getRandomDay();
    switchDayOfTheWeek(randomDay);
  }


  public static void switchDayOfTheWeek(DayOfTheWeek weekDay){

    int weekDayIntger = weekDay.ordinal() + 1;
    switch (weekDay){
      case WED -> System.out.println("Wednesday is the day " + weekDayIntger);
      case SAT -> System.out.println("Saturda is the day " + weekDayIntger);
      default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase()
    + " day is day " + weekDayIntger);
    }

  }

  public static DayOfTheWeek getRandomDay(){

    int randomInteger = new Random().nextInt(7);
    var allDays = DayOfTheWeek.values();

    return allDays[randomInteger];
  }
}
