package PolymorphismChallenge;

public class Main {

  public static void main(String[] args) {

    Car car = new Car("Car");
    Car gasCar = new GasPoweredCar("Honda Civic", 15, 4);
    Car ElectricCar = new ElectricCar("BMW IX3", 450,113);
    Car HybridCar = new HybridCar("Bentley Flying Spur", 80, 25, 8);

    car.drive();
    gasCar.drive();
    ElectricCar.drive();
    HybridCar.drive();

    System.out.println("-------------------------");

    car.runEngine();
    gasCar.runEngine();
    ElectricCar.runEngine();
    HybridCar.runEngine();

    System.out.println("-------------------------");

    car.startEngine();
    gasCar.startEngine();
    ElectricCar.startEngine();
    HybridCar.startEngine();


    
  }
  
}
