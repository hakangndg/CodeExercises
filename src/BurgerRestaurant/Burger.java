package BurgerRestaurant;

public class Burger {

  private String type;
  private double price;

  public Burger(String type){
    this.type = type;
    if(type.toLowerCase().equals("cheeseburger")){
      this.price = 10;
    }
    else{
      this.price = 6;
    }
  }

  public Burger(){
    this("Regular Burger");
  }

  public double getPrice(){
    return price;
  }
  public String getType(){
    return type;
  }

  @Override
  public String toString(){
    return "Burger type: " + type + " --- price: " + price +"\n";
  }


  
}
