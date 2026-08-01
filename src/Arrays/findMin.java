package Arrays;
import  java.util.Scanner;
public class findMin {

  public static int[] readIntegers(int size){
    int[] array = new int[size];
    Scanner  sc  =  new Scanner(System.in);
    for(int i = 0 ; i < size ;  i++){
      System.out.println("Please enter the " + (i+1) + " . number");
      int val = sc.nextInt();
      array[i] =  val;  
    }
    return array;
  }

  public static int findMinValue(int[] arr){
    int min = arr[0];
    for(int i = 1 ; i < arr.length ; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int[] myArray =  readIntegers(5);
    System.out.println(findMinValue(myArray));
  }
  
}
