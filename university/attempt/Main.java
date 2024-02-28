package IB_QUESTIONS.src.university.attempt;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import IB_QUESTIONS.src.university.Course;
import IB_QUESTIONS.src.university.Student;
import IB_QUESTIONS.src.university.Professor;

public class Main {

    public static void main(String[] args) {

        String [] names = {"Paul", "sophie", "Tolu", "Lawson", "Titi", "Ibrahim", "Eniola"};
        String [] titles = {"Python", "java", "RDBMS", "SQL", "Android"};
        int id = 0;
        List <Student> students = new ArrayList<>();
        List <Professor> profs = new ArrayList<>();
        List <Course> courses = new ArrayList<>();
        Random rd = new Random();

        // add professor
        for (int i = names.length - 2; i < names.length; i++) {
            String name = names[i];
            Professor prof = new Professor(
                    ++id, generateRandomNumber(),
                    name, "sdfghjkl", "09876543");
            profs.add(prof);
//            System.out.println(prof);

        }

        // create courses
        for (String title : titles) {
            Course course = new Course(
                    title.substring(0, 2) + generateRandomNumber(),
                    title, profs.get(rd.nextInt(profs.size())));
            System.out.println(course);
            courses.add(course);
        }

        // add student
        id = 1000;
        for (int i = 0; i < names.length - 2; i++) {
            String name = names[i];
            List <Course> courseList = new ArrayList<>();
            for (Course course : courses) {
                if (rd.nextBoolean())
                    courseList.add(course);
            }
            Student s = new Student(
                    ++id, rd.nextInt(10, 30),
                    name, "sdfghjkl", "09876543", courseList);

            students.add(s);
            System.out.println(s);

        }

    }
    static int generateRandomNumber() {
        return new Random().nextInt(10, 30);
    }

} 