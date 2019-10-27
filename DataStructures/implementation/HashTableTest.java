import java.util.*;

public class HashTableTest {
    static Hashtable<Integer, Integer> ht = new Hashtable<>();

    public static void main(String[] args) {
        for(int i=0; i<30; i++) {
            int num = (int)(Math.random()*100);
            ht.put(i, num);
        }

        //keys
        Enumeration ek = ht.keys();
        while(ek.hasMoreElements()) {
            System.out.print(ek.nextElement()+" ");
        }
        System.out.println();

        // Enumeration elements()
        Enumeration e = ht.elements();
        while(e.hasMoreElements()) {
            System.out.print(e.nextElement()+" ");
        }
        System.out.println();

        //Entry set
        Set s = ht.entrySet();
        System.out.println(s);

        //Key set
        Set sKey = ht.keySet();
        System.out.println(sKey);

        //values()
        System.out.println(ht.values());

    }
}