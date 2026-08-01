package Lists;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorTest {

  public static void main(String[] args) {
    
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(1);
    list.addLast(3);
    list.add(5);
    System.out.println(list);

    Iterator<Integer> iterator = list.iterator();
    Iterator<Integer> iterator2 = list.listIterator(2); //list iteratorde hasPrevious var, add var, index koyma var
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
  
}
