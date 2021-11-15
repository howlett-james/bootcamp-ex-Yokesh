package day03;

import java.util.*;


public class MapConcepts {
    public static void main(String args[]){
        //HashMap
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //LinkedHashMap
        Map<Integer,BookClass> hashMap=new LinkedHashMap<>();
        BookClass b1=new BookClass(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookClass b2=new BookClass(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookClass b3=new BookClass(103,"Operating System","Galvin","Wiley",6);

        hashMap.put(2,b2);
        hashMap.put(1,b1);
        hashMap.put(3,b3);
        for(Map.Entry<Integer, BookClass> m:hashMap.entrySet()){
            int key = m.getKey();
            BookClass b = m.getValue();
            System.out.println(key +" Details:");
            System.out.println(b.id +" " +b.name +" " +b.author +" " +b.publisher +" "+b.quantity);
        }
    }
}
