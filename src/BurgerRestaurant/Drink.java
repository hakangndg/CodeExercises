package BurgerRestaurant;
import java.util.Scanner;
public class Drink {

  private String type;
  private String size;
  private double price;

  public Drink(String type, String size){
    this.type = type;
    this.size = size;
    if(size.toLowerCase().equals("small")){
      this.price = 2;
    }
    else if(size.toLowerCase().equals("medium")){
      this.price = 3;
    }
    else if(size.toLowerCase().equals("large")){
      this.price = 4;
    }
  }

  public Drink(){
    this("Coke","small");
  }

  public void changeSize(){
    System.out.println("Please enter 'small' , 'medium' or 'large' to change the size of your drink");
    Scanner sc = new Scanner(System.in);
    String newSize = sc.nextLine().toLowerCase();
    if(newSize.equals("small")){
      this.size = "small";
      this.price = 2;
    }
    else if(newSize.equals("medium")){
      this.size = "medium";
      this.price = 3;
    }
    else if(newSize.equals("large")){
      this.size = "large";
      this.price = 4;
    }
  }

  public String getType(){
    return type;
  }
  public double getPrice(){
    return price;
  }
  public String getSize(){
    return size;
  }

  @Override
  public String toString(){
    return "Drink: " + type + " --- Size: " + size + " --- Price: " + price +"\n";
  }
  
}
