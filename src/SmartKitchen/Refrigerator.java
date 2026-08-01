package SmartKitchen;
public class Refrigerator {

  private boolean hasWorkToDo;

  public Refrigerator(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood(){
    System.out.println("the food is ordered !");
  }

  public boolean GetHasWorkToDo() {
    return hasWorkToDo;
  }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }
  

  
  
}
