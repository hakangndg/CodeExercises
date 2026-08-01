package Lists;

import java.util.Scanner;
import java.util.ArrayList;

public class MiniChallenge { 

  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean isOpen = true;
    
    while(isOpen) {

      System.out.println(" 0 to shutdown \n 1 to add item \n 2 to remove an item \n 3 to display list");
      String input = sc.nextLine();
      
      if(input.equals("0")) {
        System.out.println("logging out...");
        break;
      }
      else if(input.equals("1")) {
        System.out.println("Please enter the value of the number that you want to add:");
        int number = sc.nextInt();
        
        
        sc.nextLine(); 
        
        list.add(number);
      }
      else if(input.equals("2")) {
        System.out.println("please enter the value of the number that you want to remove:");
        int numberToRemove = sc.nextInt();
        
        
        sc.nextLine(); 
        
        if(list.contains(numberToRemove)) {
          
          list.remove(Integer.valueOf(numberToRemove)); 
          System.out.println("The number of " + numberToRemove + " was removed");
        }
        else {
          System.out.println("the number is not on the list");
        }
      }
      else if(input.equals("3")) {
        System.out.println("the array list : " + list);
      }
      else {
        System.out.println("the input of " + input  + " is not a valid choice ! please enter a valid number");
      }
    }
    
    sc.close(); 
  }
}