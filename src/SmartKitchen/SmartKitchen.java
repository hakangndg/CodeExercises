package SmartKitchen;
public class SmartKitchen {

  private CoffeMaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;

  public SmartKitchen(){
    brewMaster = new CoffeMaker(false);
    iceBox = new Refrigerator(false);
    dishWasher = new DishWasher(false);
  }
  

  public void addWater(){
    System.out.println("the water has been added !");
  }
   
  public void pourMilk(){
    System.out.println("the milk was poured !");
  }

  public void loadDishWasher(){
    System.out.println("the dishwasher was loaded !");
  }

  public void setKitchenState(boolean a, boolean b, boolean c){
    brewMaster.setHasWorkToDo(a);
    iceBox.setHasWorkToDo(b);
    dishWasher.setHasWorkToDo(c);
  }

  public void doKitchenWork(){
    if(brewMaster.getCoffeMaker()){
      brewMaster.brewCoffe();
    }
    if(iceBox.GetHasWorkToDo()){
      iceBox.orderFood();
    }
    if(dishWasher.getDishWasher()){
      dishWasher.doDishes();
    }
  }


  public CoffeMaker getBrewMaster() {
    return brewMaster;
  }


  public DishWasher getDishWasher() {
    return dishWasher;
  }


  public Refrigerator getIceBox() {
    return iceBox;
  }
  
}
