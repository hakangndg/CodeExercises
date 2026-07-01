package BurgerRestaurant;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    getOrder();


  }

  public static void getOrder(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the type of burger : 'cheeseburger' or 'regular' ");
    String burgerType = sc.nextLine();
    Burger burger = new Burger(burgerType);

    System.out.println("Please enter the drink you want");
    String drinkType = sc.nextLine();
    System.out.println("Good ! you want " + drinkType + " now please enter the size : 'small', 'medium' or 'large'" );
    String drinkSize = sc.nextLine();
    Drink drink = new Drink(drinkType, drinkSize);
    System.out.println("Are you sure you want this size? y/n ?");
    String answer = sc.nextLine();
    if(answer.equals("n")){
      drink.changeSize();
    }
    

    System.out.println("Lastly, please enter the side item you want");
    String sideItemType = sc.nextLine();
    SideItem sideItem = new SideItem(sideItemType);

    Meal meal = new Meal(burger,drink,sideItem);
    double totalPrice = meal.getTotalPrice(burger, drink, sideItem);
    System.out.println("Your order : " + "\n" + meal.toString() + "\n" + "Total price: " +totalPrice);

  }
  
}
