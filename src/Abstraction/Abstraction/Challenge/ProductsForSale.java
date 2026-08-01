package Abstraction.Abstraction.Challenge;

public abstract class ProductsForSale {

  private String type;
  private double price;
  private String description;


  public ProductsForSale(String type, double price, String description) {
    this.type = type;
    this.price = price;
    this.description = description;
  }

  public double getSalesPrice (int quantity) {
    return quantity * price;
  }

  
  public String getType() { return type; }
  public double getPrice() { return price; }
  public String getDescription() { return description; }

  public void printPricedItem(int quantity)  {

    System.out.println("Requested amount : " + quantity + " --- Total Price : " + quantity * price);
  }

  public abstract void showDetails();
  
  
}
