import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteretor {
    public static void main(String[] args) {
List<Object> list = new ArrayList<>();
list.add("A");
list.add(1);
list.add(5.5);
list.add(12f);
list.add('a');
list.add(true);
Iterator list1 =list.iterator();
while (list1.hasNext())
    System.out.println(list1.next());


    }
}


