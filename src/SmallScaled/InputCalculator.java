package SmallScaled;
import java.util.*;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int avg = 0;
        boolean end = false;
        
        while(!end){
            try{
            System.out.println("please enter number to process or non-number to quit and print sum and average");
            int number = sc.nextInt();
            sum += number;
            counter++;
            }
            catch(InputMismatchException quit){
                avg = sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + avg + ".");
                end = true;
            }
        }
    }

    public static void main(String args[]){
        inputThenPrintSumAndAverage();
    }
}