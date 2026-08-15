import java.util.ArrayList;

/**
 * AddandPrint
 */
public class AddandPrint {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}