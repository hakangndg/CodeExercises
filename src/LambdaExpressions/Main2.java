package LambdaExpressions;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.random.RandomGenerator;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));
  
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println("_".repeat(10));

    list.forEach((var myString) -> System.out.println(myString));

    System.out.println("_".repeat(10));

    String prefix = "nato"; //sonradan değiştiremem
    list.forEach((var myString) -> {
      char first = myString.charAt(0); 
      System.out.println(prefix + " " + myString +" means " + first);
    });

  

    int result = calculator((a,b) -> a+b, 5, 2);
    String result1 = calculator((a,b) -> a.toUpperCase() + b.toUpperCase(), "Hakan" , "Henry");
    double result2 = calculator((a,b) -> a/b, 10.0,3.0); //10/3 de 3 döndürür çünkü metottda döndürme tipi Integer olmuştur
   
    var coords = Arrays.asList(
        new double[]{1.2, 2.1},
        new double[]{3.4, 4.3},
        new double[]{5.6, 6.5}
    );

    coords.forEach(s -> System.out.println(Arrays.toString(s)));

    BiConsumer<Double, Double> p1 = (lat,lng) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat ,lng);

    var firstPoint = coords.get(0);
    processPoint(firstPoint[0], firstPoint[1], p1);

    System.out.println("---------");
    coords.forEach(s -> processPoint(s[0], s[1], p1));
    System.out.println("------------------");
    coords.forEach(s -> processPoint(s[0], s[1],  //another way of writing
      (lat,lng) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat ,lng)));

    list.removeIf(s -> s.equalsIgnoreCase("bravo"));
    list.forEach(s -> System.out.println(s));
    System.out.println("----------");
    list.addAll(List.of("echo", "easy"));
    list.forEach(s -> System.out.println(s));
    System.out.println("----------");
    list.removeIf(s -> s.startsWith("ea"));
    list.forEach(s -> System.out.println(s));
    System.out.println("----------");

    list.replaceAll(s -> s.charAt(0) + " " + s.toUpperCase());
    list.forEach(s -> System.out.println(s));

    /*String emptyString[] = new String[10];
    Arrays.fill(emptyString, " ");
    System.out.print(Arrays.toString(emptyString));
    Arrays.setAll(emptyString, (i) -> "" + (i+1) + ". ");
    System.out.println();
    System.out.print(Arrays.toString(emptyString));*/

    /*Arrays.setAll(emptyString,(int i) -> "" + (i+1) + ". " + switch(i) {
      case 0 -> "one";
      case 1 -> "two";
      case 2 -> "three";
      default -> "";
    });

    System.out.println("---------");
    System.out.print(Arrays.toString(emptyString));

    String[] names = {"Hakan", "Henry", "Alan"};
    String[] randomList = randomlySelectedValues(5, names, () -> new Random().nextInt(0,names.length));
    System.out.println();
    System.out.println(Arrays.toString(randomList));*/

    calculator((s1,s2) -> s1+s2, "I love ", "Pizza");
    calculator((s1,s2) -> s1.concat(s2), "I love ", "Hamburger");
    calculator(String::concat, "I love ", "Yağlama");

    BinaryOperator<String> b1 = (s1,s2) -> s1+s2;  //if all the inputs and output is the same data type
    BinaryOperator<String> b2 = String::concat; //method reference
    BiFunction<String,String,String> bi1 = (String s1, String s2) -> s1+s2; //if we are using multiple data types
    BiFunction<String,String,String> bi2 = String::concat; //method reference
    //UnaryOperator<String> u1 = String::concat; //error, unaryoperator takes only one input
    //UnaryOperator<String> u2 = (s1,s2) -> s1+s2;// //same error, we are having 2 inputs in this example
    UnaryOperator<String> u3 = (s1) -> s1.toUpperCase();
    UnaryOperator<String> u4 = String::toUpperCase;

    /*System.out.println(b1.apply("Hello ", "World"));
    System.out.println(b2.apply("Hello ", "World"));
    System.out.println(bi1.apply("Hello ", "Ma'am"));
    System.out.println(bi2.apply("Hello ","Ma'am"));
    System.out.println(u3.apply("hakan"));
    System.out.println(u4.apply("henry"));

    String Result = "Hello".transform(u3); //using function in the transform method
    System.out.println(Result);

    String a = "Hello".transform((s1) -> s1.toUpperCase()); //written by directly lambda
    System.out.println(a);

    String b = "Hello".transform(String::toUpperCase); //written by method reference
    System.out.println(b);

    b = b.transform(String::toLowerCase);
    System.out.println(b);

    Function<String,Boolean> f0 = String::isEmpty;
    boolean resultBoolean = Result.transform(f0);
    System.out.println(resultBoolean);

    System.out.println(a.transform(String::isEmpty)); //another way of using the method*/


    //Mini Challenge //

    String foods[] = {"pizza","hamburger","lemonade","spagetti"};
    UnaryOperator<String> upper = String::toUpperCase;
    for (int i = 0; i < foods.length; i++) {
      foods[i] = upper.apply(foods[i]);
    }
    System.out.println(Arrays.toString(foods));
    UnaryOperator<String> reverseName = s -> new StringBuilder(s).reverse().toString();
    for (int i = 0 ; i < foods.length ; i++) {
      foods[i] = foods[i] + " " + reverseName.apply(foods[i]); 
    }
    System.out.println(Arrays.toString(foods));
    String cake = "cake".transform(reverseName);
    foods[0] = cake;
    System.out.println(Arrays.toString(foods));

    List<UnaryOperator<String>> functionList = List.of(
            reverseName,              
            String::toLowerCase,
            s -> s + " " + getRandomChar('D', 'M') + "."              
    );

    transformer(foods, functionList);
    System.out.println(Arrays.toString(foods));
    

  }

  //////////////////////// END OF MAIN METHOD ////////////////////////////////////////////////
  /// 
  /// 
  /// 
  /// 
  /// 
  /// 
  /// 
  /// 
  /// 
  private static Random random = new Random();
  private static char getRandomChar (char startChar, char endChar) {
    return (char) random.nextInt((int) startChar, (int) endChar + 1);
  }
  
  public static void transformer (String[] array, List<UnaryOperator<String>> list) {
      
    for (int i = 0 ; i < array.length ; i++) {
      for (var func : list) {
        array[i] = array[i].transform(func);
      }
    }
  }

  public static <T> T calculator(Operation<T> function, T value1, T value2) {

    T result = function.operate(value1, value2);
    System.out.println("Result of operation " + result);
    return result;
  }

  //There is an existing interface called "Binary Operator" to make such operations

  public static <T> T calculator2(BinaryOperator<T> function, T value1, T value2) {
    T result = function.apply(value1, value2);
    System.out.println("Result of operation is " + result);
    return result;
  }

    /*
    4 Basic Types of Functional Interfaces:

    Consumer : void accept(T t) -> execute code without returning data
    Function : R apply(T t) -> return a result of an operation or function
    Predicate: boolean Test(T t) -> test if a condition is true or false
    Supplier : T get() -> return an instance of something
    
    
    
    */
  
    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
      consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {
      String[] selectedValues = new String[count];
      for (int i = 0 ; i < count ; i++) {
        selectedValues[i] = values[s.get()];
      }
      return selectedValues;
      
    }

    
}
