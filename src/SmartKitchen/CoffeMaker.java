package SmartKitchen;
public class CoffeMaker {

  private boolean hasWorkToDo;

  public CoffeMaker(boolean hasWorkToDo){
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffe(){
    System.out.println("brew coffe is getting prepared");
  }

  public boolean getCoffeMaker(){
    return hasWorkToDo;
  }

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }
  
  
}
