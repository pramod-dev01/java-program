import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
        }

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(10, 20, 30, 10, 40, 20));
        
        // Iterate Through the forEach Loop
        for (Integer value : hs) {
            // System.out.print(value+ " ");
        }

        // Iterate Through the Iterator
        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
