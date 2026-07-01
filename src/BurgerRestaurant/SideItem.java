package BurgerRestaurant;

public class SideItem {

  private String type;
  private double price;

  public SideItem(String type){
    this.type = type;
    this.price = 2;
  }

  public SideItem(){
    this("fries");
  }

  public String getType(){
    return type;
  }
  public double getPrice(){
    return price;
  } 

  @Override
  public String toString(){
    return "SideItem: " + type + " --- Price: " + price;
  }
  
}
