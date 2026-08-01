package SmallScaled;
public class Dog extends Animal{

  private String earShape;
  private String tailShape;

  public Dog(){
    super("Mutt","Big",50); //it's a way to call a constructor on the super class directly from the sub class's constructor (like this() - has to be in the first line )
  }

  public Dog(String type, double weight){
    this(type, weight, "perky","curled");
  }
  public Dog(String type,  double weight, String earShape, String tailShape){
    super(type, weight < 15 ? "small" : (weight < 35 ?  "medium" : "large"),weight);
    this.earShape = earShape;
    this.tailShape = tailShape;
  }

  @Override
  public String toString() {
    return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString() + "]";
  }

  @Override 
  public void move(String speed){
    super.move(speed);
    System.out.println("dog walks, run and wag their tail");
  }

  private void bark(){
    System.out.println("Woof !");
  }

  private void run(){
    System.out.println("the dog is running");
  }

  private void walk(){
    System.out.println("the dog is walking");
  }

  

  
}
