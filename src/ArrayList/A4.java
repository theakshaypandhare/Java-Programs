package ArrayList;
import java.util.ArrayList;

public class A4 {public static void main(String[] args) {

ArrayList fruit=new ArrayList();
fruit.add("apple");
fruit.add("bananana");

ArrayList vegitables=new ArrayList();
vegitables.add("chilly");
vegitables.add("potato");

fruit.addAll(0, vegitables);
System.out.println(fruit);

}
}
