import servlets.MyCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> wetherList = new ArrayList<>();
        wetherList.add("cloud");
        wetherList.add("cloudy");
        wetherList.add("cold");
        wetherList.add("dry");
        wetherList.add("fog");
        wetherList.add("foggy");
        wetherList.add("frost");

        Iterator<String> iterator = wetherList.iterator();
        while (iterator.hasNext()){
            String wetherWord = iterator.next();
            System.out.println(wetherWord);
        }
        System.out.println(wetherList);


        ArrayList<String> ls = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        TreeSet<String> treeSet;
        TreeMap<String, String > treeMap;
        HashMap<String, String> hashMap;

        MyCollection<String> myCollection = new MyCollection<>("qqq");

        myCollection.add("www");
        System.out.println(myCollection);
    }
}
