package SmallScaled;
public class switch_newer {

  public static void main(String args[]){

    int val = 5;
    switch(val){
      case 1 -> System.out.println("the number was 1");
      case 2,3,4 ->{
         System.out.println("the number was either 2,3 or 4");
         System.out.println("Actually it was " + val);
      }
      default -> System.out.println("the number was not 1,2,3 or 4");
    }

    printDayOfWeek(8);
    
  }
  public static String getQuarter(String month){
    return switch(month){
      case "january","february","march" -> "1st";
      case "april", "may" ,"june" -> "2nd";
      case "july","august","september" -> "3rd";
      case "october","november","december" -> "4th";
      default -> {
        String badResponse = month +" bad";
        yield badResponse;
      }
    };
  }

  public static String getNATO(char val){
    switch(val){
      case 'A':
        return "Able";
  
      case 'B':
        return "Baker";
      case 'C':
        return "Charlie"; 
      case 'D':
        return "Dog";
      default:
        return "enter a valid char";
     
    }

  }

  public static void printDayOfWeek(int day){
    switch(day){
      case 0 -> System.out.println("sunday");
      case 1 -> System.out.println("monday");
      case 2 -> System.out.println("tuesday");
      case 3 -> System.out.println("wednesday");
      case 4 -> System.out.println("thursday");
      case 5 -> System.out.println("friday");
      case 6 -> System.out.println("saturday");
      default -> System.out.println("invalid day");
    }
  }
  
}
