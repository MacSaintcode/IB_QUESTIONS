package saintcoded;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Tolu {
    public static void main(String[] args) {

        List <Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        System.out.println("lst: " + lst);
        Set <Integer> set = new HashSet<>(lst);
        System.out.println("list add 1: " + lst.add(1));
        System.out.println("list add 7: " + lst.add(7));
        System.out.println("set: " + set);
        System.out.println("set add 1: " + set.add(1));
        System.out.println("set add 7: " + set.add(7));

        // fori, enhanced-for, iterator loop
        Iterator <Integer> it = lst.iterator();
        for (; it.hasNext();) {
            System.out.println("for: " + it.next());
        }

        Iterator it2 = lst.iterator();
        while (it2.hasNext()) {
            System.out.println("while: " + it2.next());
        }

        Map <String, Integer> map = new HashMap<>();
        map.put("SQL", 21);
        map.put("Python", 12);
        map.put("Java", 78);
        map.put("HTML5", 87);
        
        System.out.println("map: " + map);
        Map <String, Integer> tree = new TreeMap<>();
        tree.putAll(map);
        System.out.println("tree: " + tree);
        System.out.println(map.get("Java"));
        System.out.println(map.get("Javax"));

        // duplicate key
        map.put("Java", 34);
        map.put("Logic", 45);
        map.putIfAbsent("RDBMS", 23);
        System.out.println("map: " + map);

        // loop through - entrySet
        // for (String key : map.keySet()) {
        //     map.replace(key,  58);
        //     System.out.println(map.get(key));
            
        // }
                System.out.println("map: " + map);

        // Set <String> keys = map.keySet();
        // for (String key : keys) {
        //     System.out.println(map.get(key));
        // }

        

    }
}
