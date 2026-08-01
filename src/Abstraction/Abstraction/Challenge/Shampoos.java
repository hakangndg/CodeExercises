package Abstraction.Abstraction.Challenge;

public class Shampoos extends ProductsForSale {

  public Shampoos(String type, double price, String description) {
    super(type, price, description);
  }

  @Override
  public void showDetails() {
    System.out.println("Product type : " + getType() + " Description : " + getDescription() + " Price: " + getPrice());
  }
  
}
