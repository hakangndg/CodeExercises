package Arrays;

public class reverseArray {

  public static int[] reverseArray(int[] array){
    int start = 0;
    int finish = array.length - 1;
    for(int i = 0 ; i < array.length / 2 ; i++){
      int temp = array[start];
      array[start] = array[finish];
      array[finish] = temp;
      start++;
      finish--;
    }  
    return array;
  }

  public static void printArray(int[] arr){
    for(int element : arr){
      System.out.println(element +" ");
    }
  }

  public static void main(String[] args) {
    int[] myArray = {1,2,3,4,5};
    printArray(reverseArray(myArray));
  }
  
}
