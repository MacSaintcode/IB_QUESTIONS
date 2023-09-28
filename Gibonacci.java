package saintcoded;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gibonacci {

    int Gibonacci(int n, int x, int y) {
        List<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(x);
        arr.add(y);
        int i = 0;

        if (n == 0) {
            return x;
        } else if ((n == 1)) {
            return y;
        } else {
            for (i = 2; i <= n; i++) {
                int term = (arr.get(i - 1) - arr.get(i - 2));
                arr.add(term);
                System.out.println(arr);
            }
        }
        return arr.get(i - 1);
    }

    public static void main(String[] args) {
        Gibonacci call = new Gibonacci();

        // user friendly code u must not input numbers less than 0
        System.out.println(call.Gibonacci(3, 0, 1));

    }

}
