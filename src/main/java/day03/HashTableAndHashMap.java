package day03;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableAndHashMap {
    public static void main(String[] args) {
        Hashtable<Object,Object> h = new Hashtable<>();
        h.put("A","Test");
        h.put("B","Hello");
        h.put("C","World");
        System.out.println(h.size());

        h.put(1,213);
        h.put(2,421);
        h.put(3,459);
        System.out.println(h.size() );

        System.out.println(h.get(3));
        System.out.println(h.get("C"));
    }
}