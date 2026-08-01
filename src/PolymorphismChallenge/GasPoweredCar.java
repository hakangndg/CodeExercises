package PolymorphismChallenge;

public class GasPoweredCar extends Car{

  private double avgKmPerLitre;
  private int cylinders;

  public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine(){
    System.out.println("Welcome! This is gas powered car : "+ getDescription() +"  and it has " + cylinders + " cylinders");
    System.out.println();
  }

  @Override
  public void drive(){
    System.out.println("Driving a gas powered car..." + getDescription());
    System.out.println("The average kilometer per liter is " + avgKmPerLitre);
    System.out.println();
  }

  @Override
  public void runEngine(){
    System.out.println("Running the engine.... (gas powered car)");
    System.out.println();
  }
  
}
