package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetConcepts {
    public static void main(String[] args) {
        //HASHSET
        HashSet<String> hs = new HashSet<>();
        hs.add("Yokesh");
        hs.add("James Howlett");
        hs.add("Logan");
        hs.add("adam");
        hs.add("charles");
        hs.add("Gray");
        System.out.println("Elements in HashSet");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

        //LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Yokesh");
        lhs.add("James Howlett");
        lhs.add("Logan");
        lhs.add("adam");
        lhs.add("charles");
        lhs.add("Gray");
        System.out.println("Elements in LinkedHashSet");
        Iterator<String> itr1 = lhs.iterator();
        while (itr1.hasNext()) System.out.println(itr1.next());

        //TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("yokesh");
        ts.add("logan");
        ts.add("james howlett");
        ts.add("adam");
        ts.add("kayla");
        System.out.println("Elements in TreeSet");
        Iterator<String> itr2 = ts.iterator();
        while (itr2.hasNext()) System.out.println(itr2.next());
    }
}
