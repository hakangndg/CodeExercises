package Abstraction.Abstraction.Challenge;
import java.util.ArrayList;

public class Store {

  private ArrayList<ProductsForSale> productsForSale;
  private ArrayList<ProductsForSale> OrderItem;
  
  public Store(){
    this.productsForSale = new ArrayList<>();
    this.OrderItem = new ArrayList<>();
  }

  public void addToOrder(ProductsForSale product) {
    OrderItem.add(product);
  }

  public void printOrderedItems(){

    for (ProductsForSale product : OrderItem) {
      System.out.println(product);
    }
  }

  public void addToSale(ProductsForSale product){
    if (!productsForSale.contains(product)) {
      productsForSale.add(product);
    }
  }
  
}
