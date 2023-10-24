package saintcoded;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Scores {
    static List<Integer> lst = new ArrayList<>();
    static Map<String, String> map = new HashMap<>();
    static Set<String> set = new HashSet<>();
    String course;
    String score;
    int scored;
    // String cours;
    boolean results = false;
    Scanner scan = new Scanner(System.in);

    void promt() {
        int input = 0;
        while (true) {
            System.out.print("HOW MANY COURSES ARE YOU OFFERING? ");
            String inp;
            inp = scan.next();
            String rege = "[0-9]+";
            Boolean result = Pattern.matches(rege, inp);

            if (result) {
                input = Integer.parseInt(inp);
                if (input <= 0) {
                    System.out.println("Invalid Range, Valid Range: >=1");
                    continue;
                } else {
                    break;
                }

            } else {
                System.out.println("Invalid Input, Try Again.");
            }
        }

        for (int i = 0; i < input; i++) {
            accept();
        }

        System.out.println(set);
        System.out.println(lst);
        System.out.println(map);

        int choice = 1;
        while (true) {
            System.out.println("\t    ....MENU....");
            System.out.println("\t(1) Change Score.");
            System.out.println("\t(2) Check Score.");
            System.out.println("\t(3) Add Course.");
            System.out.println("\t(4) Quit.");

            while (true) {

                System.out.print("\nChoose An Option: ");
                String choic = scan.next();
                String rege = "[0-9]+";
                Boolean result = Pattern.matches(rege, choic);
                if (result) {
                    choice = Integer.parseInt(choic);
                    break;
                } else {
                    System.err.println("Invalid Input.Try Again");
                }
            }

            switch (choice) {
                case 1: {
                    case1();
                    break;
                }

                case 2: {
                    case2();
                    break;
                }

                case 3: {
                    case3();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.err.println("Invalid Input!, Try Again.");
                    break;
            }
            results = false;
        }
    }

    void grading(String course, int score) {
        String grade;

        grade = score == 100 ? "BOSS"
                : (score >= 70) ? "A1"
                        : (score >= 65) ? "B2"
                                : (score >= 50) ? "C5"
                                        : (score >= 30) ? "D4"
                                                : "F9";
        map.put(course, grade);
    }

    void changescore(String course, int score) {
        boolean result = false;

        Iterator it2 = set.iterator();
        int in = 0;

        while (it2.hasNext()) {
            if (it2.next().equals(course)) {
                lst.set(in, score);
                grading(course, score);
                result = true;
                break;
            }
            in++;
        }
        if (result == true) {
            System.out.format("%s score Has Been Changed to: %d ( %s )\n", course, score, map.get(course));
        }
    }

    void addcourses() {
        accept();
        System.out.println(map);
        System.out.println(lst);
    }

    void checkscore(String course) {
        int sco = 0;
        Iterator it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().equals(course)) {
                sco = lst.get(i);
                break;
            }
            i++;
        }
        System.out.println(map);
        System.out.format("Your Score for %s is %d\n", course, sco);
    }

    void case1() {
        while (true) {
            String cors = get_course();
            Iterator it5 = set.iterator();
            while (it5.hasNext()) {
                if (it5.next().equals(cors)) {
                    int squir = 0;
                    while (true) {
                        System.out.print("Enter New Score: ");
                        String scor = scan.next();
                        String rege = "[\\d]+";
                        Boolean result = Pattern.matches(rege, scor);
                        if (result) {
                            squir = Integer.parseInt(scor);
                            if (squir > 100 || squir < 0) {
                                System.err.println("Score Range Is 1-100");
                                continue;
                            } else {
                                break;
                            }
                        }
                    }
                    changescore(cors, squir);
                    results = true;
                    break;
                }
            }
            if (!results) {
                System.out.format("%s Has Not Been Registered!", cors);
                continue;
            } else {
                System.out.println("Done!");
                break;
            }
        }
    }

    void case2() {
        while (true) {
            String cors = get_course();
            Iterator it7 = set.iterator();
            while (it7.hasNext()) {
                if (it7.next().equals(cors)) {
                    checkscore(cors);
                    results = true;
                    break;
                }
            }
            if (!results) {
                System.out.format("%s Has Not Been Registered!\n", cors);
                continue;
            } else {
                System.out.println("Done!");
                break;
            }
        }
    }

    void case3() {
        addcourses();
    }

    String get_course() {
        String cours;
        while (true) {
            System.out.print("Enter Your Course: ");
            cours = scan.next();
            String rege = "[A-Za-z]+";
            Boolean resul = Pattern.matches(rege, cours);
            if (resul) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }
        return cours;
    }

    void accept() {
        while (true) {
            System.out.print("ENTER YOUR COURSE: ");
            course = scan.next();
            String rege = "[A-Za-z]+";
            Boolean result = Pattern.matches(rege, course);
            if (result) {
                set.add(course);
                break;
            } else {
                System.out.println("Invalid Course!, Enter a Valid Course.");
            }
        }

        while (true) {
            System.out.print("WHAT'S YOUR SCORE: ");
            score = scan.next();
            String rege = "[0-9]+";
            Boolean result = Pattern.matches(rege, score);
            if (result) {
                if ((Integer.parseInt(score)) > 100 || (Integer.parseInt(score)) < 0) {
                    System.err.println("Score Range Is 1-100");
                    continue;
                }
                lst.add(Integer.parseInt(score));
                break;
            } else {
                System.out.println("Bad Input!,Expecting Int.");
            }
        }
        scored = Integer.parseInt(score);
        grading(course, scored);
    }

    public static void main(String[] args) {
        Scores call = new Scores();
        call.promt();
    }
}