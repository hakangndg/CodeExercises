package Generics.methodParameters;
import java.util.Random;
import java.util.List;

public class lpaStudent extends Student {

  private double percentCompleted;

  public lpaStudent() {
    super();
    this.percentCompleted = random.nextDouble(100.1);
  }

  @Override
  public String toString() {
    return super.toString() + " percent completed: " + percentCompleted;
  } 
  
}
