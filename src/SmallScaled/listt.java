package SmallScaled;

import java.util.ArrayList;

public class listt {

  record grocery(String name, String type, int count){

    public grocery(String name){
    this(name,"Diary",6);
  }

} 


  public static void main(String[] args) {

    ArrayList<grocery> groceryList = new ArrayList<>();
    groceryList.add(new grocery("milka","chocolate",3));
    // groceryList.add("Apple"); //will give an error since it is 'grocery' list
    
  }
  
}
