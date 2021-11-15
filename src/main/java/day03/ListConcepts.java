package day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListConcepts {
    public static void main(String[] args) {
        //ArrayList -- Non-Generic
        ArrayList ar = new ArrayList();

        ar.add(12);
        ar.add(1213);
        ar.add(12324);
        System.out.println(ar.size());
        ar.add(138);
        ar.add(8982);
        System.out.println(ar.size());
        ar.add("fad");
        ar.add("fasdkjfh");
        ar.add("kfhs");
        ar.add(212.12);
        ar.add('a');
        System.out.println(ar.size());//size of arraylist
        ar.remove(5);
        System.out.println(ar.get(5));//print a value based on index
        //to print all the values of ArrayList
        //1. for loop
        //2. Iterator

        System.out.println("Elements in Array List using for-loop");
        for (int i =0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("Elements in Array List using Iterator");
        Iterator it = ar.iterator();
        while (it.hasNext()) System.out.println(it.next());

        //ArrayList -- Generic
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, "test");
        arrayList.add(1,"sample");
        arrayList.add(2, "example");

        //Employee class Objects:
        Employee e1 = new Employee("Logan",22,"QA");
        Employee e2 = new Employee("James Howlett",22,"QA");
        Employee e3 =  new Employee("Yokesh", 22,"QA");

        //creating ArrayList
        ArrayList<Employee> arrayListEmp = new ArrayList<>();
        arrayListEmp.add(e1);
        arrayListEmp.add(e2);
        arrayListEmp.add(e3);

        //LinkedList
        LinkedList<String> ll = new LinkedList<>();
        ll.add("test");
        ll.add("sample");
        ll.add("qa");
    }
}
