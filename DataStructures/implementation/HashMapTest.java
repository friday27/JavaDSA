import java.util.*;

public class HashMapTest {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        for(int i=0; i<30; i++) {
            int num = (int)(Math.random()*100);
            map.put(i, num);
        }

        //Entry set
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }        

        System.out.println();
        //Key set
        for(Integer key: map.keySet()) {
            System.out.println(key+": "+map.get(key));
        }
    }
}