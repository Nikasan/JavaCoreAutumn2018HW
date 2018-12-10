package task6_HashMap;

import java.util.HashMap;
import java.util.Map;



public class CollectionsLearner {
    public static void main(String[] args) {
        Map myHashMap = new HashMap();
        myHashMap.put(1,"Veronika");
        myHashMap.put(2,"Veronika2");
        myHashMap.put(3,"Veronika3");
        myHashMap.put(4,"Veronika4");
        myHashMap.put(5,"Veronika5");
        System.out.println(myHashMap+"\n");
        System.out.println("Size: " +myHashMap.size());
        myHashMap.entrySet();
        System.out.println(myHashMap.entrySet());
        System.out.println("keySet: "+myHashMap.keySet());
        System.out.println("valueSet: "+myHashMap.values());


    }
}
