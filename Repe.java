package saintcoded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Repe {

    void Repete(String compair) {
        String num = "1234567890";
        for (char got : compair.toCharArray()) {
            if (num.contains(got + "")) {
                System.out.print(got);
            }

        }
        System.out.println(" ");
    }

    void checkvowels(String word) {
        String vowels = "aeiouAEIOU";
        for (char letter : word.toCharArray()) {
            if (vowels.contains(letter + "")) {
                System.out.print(letter);
            }
        }
        System.out.println(" ");

    }

    void vowelregex(String word) {
        for (char letter : word.toCharArray()) {
            if (Pattern.matches("[aeiouAEIOU]", letter + "")) {
                System.out.print(letter);
            }
        }
        System.out.println(" ");

    }

    void duplicate(int[] number) {
        String result = "";
        for (int i = 0; i < number.length; i++) {
            int pin = number[i];
            int nut = number.length;
            System.out.println(pin);

            for (int g = 0; g < number.length; g++) {

                if (pin == number[g]) {
                    // if (result.contains(pin + "")) {
                    // break;
                    // }
                    // result += pin;
                    // }

                    boolean found = false;

                    for (String added : result.split("-")) {
                        if (added.equals(pin + "")) {
                            found = true;
                        }
                    }
                    if (found == false) {
                        if (g == nut) {
                            result += pin + "";
                        }
                        result += pin + "-";

                    }

                }

            }
        }
        System.out.print(result + "");

    }
    void listrepeat(List <Integer>arr){
        List <Integer> num= new ArrayList<>();
        // for (int i = 0; i < number.length; i++) {

        // }

    }

    public static void main(String[] args) {
        Repe call = new Repe();
        // call.Repete("msrf23fdf");

        // call.checkvowels("nmfsljfkjlwjiowxk");

        // call.vowelregex("sfkeqjkqlla");

        int[] nu = { 1, 33, 33, 3, 4, 5, 3, 4, 2, 1 };

        call.duplicate(nu);

        // 1,2,3,4
    }

}
