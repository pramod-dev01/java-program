import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class AddandPrintMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(01, 100);
        mp.put(02, 200);
        mp.put(03, 300);
        mp.put(04, 400);

        //Print Key
        for (Integer key : mp.keySet()) {
            System.out.println(key);
        }

        //Print values:
        for (Integer value : mp.values()) {
            System.out.println(value);
        }

        //Print both

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry);
        }
        

    }
}
