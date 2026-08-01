package PolymorphismChallenge;

public class Car {

  private String description;

  public Car(String description){
    this.description = description;
  }

  public Car(){

  }

  public void startEngine(){
    System.out.println("engine goes 'vrumm'!!!");
    System.out.println();
  }

  public void drive(){
    System.out.println("Driving...");
    System.out.println();
  }
  
  protected void runEngine(){
    System.out.println("running engine...");
    System.out.println();
  }

  public String getDescription(){
    return description;
  }


}
