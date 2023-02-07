import java.util.*;

public class ListTrick{
    public static void main(String[] args) {
  List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
  removeEvenNumbers(list);
  System.out.println(list);
}

public static void removeEvenNumbers(List<Integer> list) {
  Iterator<Integer> iterator = list.iterator();
  while (iterator.hasNext()) {
    int number = iterator.next();
    if (number % 2 == 0) {
      iterator.remove();
    }
  }
}
}