package BurgerRestaurant;

public class Meal {

  private Burger burger;
  private Drink drink;
  private SideItem sideItem;

  public Meal(Burger burger, Drink drink, SideItem sideItem){
    this.burger = burger;
    this.drink = drink;
    this.sideItem = sideItem;
  }

  public double getTotalPrice(Burger burger, Drink drink, SideItem sideItem){
    return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
  }

  @Override
  public String toString(){
    return burger.toString() + drink.toString() + sideItem.toString();
  }
}
