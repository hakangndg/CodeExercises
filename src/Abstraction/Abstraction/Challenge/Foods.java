package Abstraction.Abstraction.Challenge;

public class Foods extends ProductsForSale {

  public Foods(String type, double price, String description) {
    super(type, price, description);
  }

  @Override
  public void showDetails() {
    System.out.println("Product type : " + getType() + " Description : " + getDescription() + " Price: " + getPrice());
  }
  
}
