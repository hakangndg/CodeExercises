import java.util.InputMismatchException;
import java.util.Scanner;
public class max_min {

  public static void printMaxMin(){
    Scanner sc = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    boolean end = false;

    while(!end){
      try{
       System.out.println("please enter a number to have it in the stack or enter non-number to quit");
       int number = sc.nextInt();
       if(number < min){
        min = number;
       }
       else if(number > max){
        max = number;
       }
      }
      catch(InputMismatchException nonNumber){
        System.out.println("you quit the loop, the max number is " + max +", the min number is " + min);
        return;
      }
    }
  }
  
  public static void main(String args[]){
    printMaxMin();
  }
}
