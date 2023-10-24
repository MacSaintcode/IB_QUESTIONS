package saintcoded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ChiefLeo {
    public static void main(String[] args) {
        Student s1 = new Student("Leo", 12);
        Student s2 = new Student("Paul", 65);
        Student s3 = new Student("Chima", 43);
        Student s4 = new Student("Tolu", 33);
        Student s5 = new Student("Mazi", 23);
        Student s6 = new Student("DJ", 73);
        Student s7 = new Student("Ayanfe", 33);
        
        List <Student> lst = new ArrayList<>();
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        lst.add(s4);
        lst.add(s5);
        lst.add(s6);
        lst.add(s7);

        // Collections.sort(lst);
        System.out.println(lst);

    }
}

// sorting - Comparable, Comparator
class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("name: %s, age is %d", name, age);
    }
    @Override
    public int compareTo(Student s) {
        if (this.age > s.age) return 1;
        // if the first argument comes first return negative value
        if (this.age < s.age) return -1;
        return 0;
    }
}
