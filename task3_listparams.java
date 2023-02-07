
import java.util.ArrayList;
import java.util.List;
 
public class Main {
 
    public static void main(String[] args) {
        // create an ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(15);
        list.add(16);
        list.add(23);
        list.add(42);
 
        // calculate min, max and mean
        Integer min = list.get(0);
        Integer max = list.get(0);
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
            sum += list.get(i);
        }
        double mean = (double) sum / list.size();
 
        // print the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Mean: " + mean);
    }
}