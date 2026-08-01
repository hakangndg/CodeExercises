package SmartKitchen;
public class DishWasher{
  private boolean hasWorkToDo;

  public DishWasher(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes(){
    System.out.println("the dishes are getting done !");
  }

  public boolean getDishWasher(){
    return hasWorkToDo;
  }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }
  
}