package Generics.Challenge;
import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable>   {

  private List<T> listOfElements = new ArrayList<>();

  
  

  public void addElement(T element) {
    if(!listOfElements.contains(element)) {
      listOfElements.add(element);
    }
  }

  public void renderLayer() {
    for (T element : listOfElements) {
      element.render();
    }
  }

  public List<T> getListOfElements() {
    return listOfElements;
  }


}
