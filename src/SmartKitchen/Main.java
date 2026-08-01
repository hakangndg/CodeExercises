package SmartKitchen;
public class Main {

  public static void main(String args[]){

    SmartKitchen smartKitchen = new SmartKitchen();
    smartKitchen.doKitchenWork();

    smartKitchen.setKitchenState(true, true, true);
    smartKitchen.doKitchenWork();


  }
  
}
