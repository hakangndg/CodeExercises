package Abstraction.Abstraction.Challenge;

public class Dog extends Mammal {

  public Dog(String type, String size, double weight) {
    super(type, size, weight);
  }

  @Override
  public void move(String speed) {
    
    if(speed.equals("slow")){
      System.out.print(getExplicitType() + " is walking ");
    }
    else {
      System.out.print(getExplicitType() + " is running ");
    }
  }

  @Override
  public void makeNoise() {

    if (type.equals("Wolf")){
      System.out.print("Howling ! ");
    }
    else {
      System.out.print("Woof ! ");
    }
    
  }

  @Override
  public void shedHair() {

    System.out.println(getExplicitType() + " sheds hair all the time ");
  }
  
}
