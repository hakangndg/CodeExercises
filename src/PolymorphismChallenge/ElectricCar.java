package PolymorphismChallenge;

public class ElectricCar extends Car {

  private double avgKmPerCharge;
  private int batterySize;

  public ElectricCar(String description,double avgKmPerCharge, int batterySize){
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  @Override
  public void drive() {
    System.out.println("Driving an electric car :"+ getDescription()+ " with average kilometer per charge of " + avgKmPerCharge);
    System.out.println();
  }

  @Override
  protected void runEngine() {
    System.out.println("Battery size: " + batterySize +" running engine of " +getDescription() );
    System.out.println();
  }

  @Override
  public void startEngine() {
    System.out.println("starting the engine..." + getDescription());
    System.out.println();
  }

  

  
  
}
