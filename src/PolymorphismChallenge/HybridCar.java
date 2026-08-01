package PolymorphismChallenge;

public class HybridCar extends Car {

  private double avgKmPerLiter;
  private int batterySize;
  private int cylinders;

  public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders){
    super(description);
    this.avgKmPerLiter = avgKmPerCharge;
    this.batterySize = batterySize;
    this.cylinders = cylinders;
  }

  @Override
  public void drive() {
    System.out.println("Driving a "+ getDescription()+ " enjoy your drive :)");
    System.out.println();
  }

  @Override
  protected void runEngine() {
    System.out.println("Running engine... " + getDescription() + " Battery size: " + batterySize +" cylinders: "+cylinders);
    System.out.println();
  }

  @Override
  public void startEngine() {
    System.out.println(getDescription() + " Starting the engine...");
    System.out.println("Average kilometer per liter is " + avgKmPerLiter);
    System.out.println();
  }

  


  
}
