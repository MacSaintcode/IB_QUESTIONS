package saintcoded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

public class Paul {
    public static void main(String[] args) {
        ArrayList <Integer> lst = new ArrayList<>();
        List <Integer> lst2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add(new Random().nextInt(12, 56));
        }
        lst2.addAll(lst);
        System.out.println("1. lst: " + lst);
        System.out.println("2. lst2: " + lst2);
        Collections.sort(lst2);
        System.out.println("3. lst: " + lst);
        System.out.println("4. lst2: " + lst2);
        Collections.shuffle(lst);
        System.out.println("5. lst: " + lst);
        System.out.println("6. lst2: " + lst2);


        // Stack, Vector, LinkedList
        
        // Set Interface - Tree/Hash/LinkedHash -- Set
        lst.clear();
        Set <Integer> s1 = new HashSet<>();
        Set <Integer> s2 = new TreeSet<>();
        Set <Integer> s3 = new LinkedHashSet<>();

        // List <Integer> s1 = new ArrayList<>();
        // List <Integer> s2 = new LinkedList<>();
        // List <Integer> s3 = new ArrayList<>();
        lst.clear();

        for(int i = 0; i< 10; i++) {
            int value = new Random().nextInt(1, 25);
            lst.add(value);
            s1.add(value);
            s2.add(value);
            s3.add(value);
        }

        // System.out.println("lst: " + lst);
        // System.out.println("s1: " + s1);
        // System.out.println("s2: " + s2);
        // System.out.println("s3: " + s3);

        for (int k : s3) {
            // System.out.println(k);
        }
        // static method reference
        // lst.forEach(());

        // B b = new B();
        // b.add(12, 17);

        // A a1 = (a, b) -> System.out.println("From A: " + (a + b + 10));
        // a.add(12, 17);
        // b.add(12, 17);
    }
}

class B implements A {
    @Override
    public void add(int a, int b) {
        System.out.println("From B: " + (a + b));
    }
}

interface A {
    void add(int x, int y);
}
