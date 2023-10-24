package saintcoded;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class courses {

    courses(String course, int score) {

        String grade;

        grade = score > 100 ? "YOU CANNOT BE TOO GREAT"
                : score == 100 ? "BOSS"
                        : (score >= 70) ? "A1"
                                : (score >= 65) ? "B2"
                                        : (score >= 50) ? "C5"
                                                : (score >= 30) ? "D4"
                                                        : "F9";

        System.out.println("YOUR GRADE IS " + grade);

    }

    void changescore(String course, int score) {

    }
    void addcourses(String course) {
        
    }
    void checkscore(String course) {
        
    }
    public static void main(String[] args) {

        System.out.print("HOW MANY COURSES ARE YOU OFFERING? ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
           courses call= new courses("java",80);
        //    call.changescore("",16);

    }

}