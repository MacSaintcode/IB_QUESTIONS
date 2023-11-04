package saintcoded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutations {

    boolean check(int n, int m, int arr[][]) {
        int team = n / 2;
        int teams = n / 2;
        boolean match = true;
        List<Integer> arrs = new ArrayList<>();
        int i, count = 0;

        int k = 0;

        for (int u = 1; u < m; u++) {

            for (i = 0; i < teams; i++) {
                arrs.add(arr[k][i]);
            }

            for (int l = 0; l < 2; l++) {

                for (int v = 1 + k; v < m; v++) {

                    int j = 0;
                    // System.out.println(j);
                    Iterator it = arrs.iterator();
                    while (it.hasNext()) {
                        Object num = it.next();
                        // System.err.println(num);
                        Object cheki = arr[v][j];
                        // System.out.println("cheki " + cheki);
                        if (num.equals(cheki)) {
                            // match = false;
                            count++;
                        } else {
                            match = true;
                        }
                        j++;
                    }

                    if (count == team) {
                        return false;
                    } else {
                        // System.out.println("\t" + match + "\n");
                        match = true;
                        count = 0;
                    }
                    int d = team;
                    Iterator it2 = arrs.iterator();
                    while (it2.hasNext()) {
                        Object num = it2.next();
                        // System.err.println(num);

                        Object cheki = arr[v][d];
                        // System.out.println("chekis " + cheki);
                        if (num.equals(cheki)) {
                            match = false;
                            count++;
                        } else {
                            match = true;
                        }
                        d++;
                    }

                    if (count == team) {
                        return false;
                    } else {
                        // System.out.println("\t" + match + "\n");
                        match = true;
                        count = 0;
                    }
                }
                // System.out.println("\n\tSwitch\n");
                arrs.clear();
                for (int p = team; p < arr[k].length; p++) {
                    arrs.add(arr[k][p]);
                }

            }
            k++;
            // System.out.println("k:" + k);

            arrs.clear();

        }
        return match;

    }

    public static void main(String[] args) {
        Permutations call = new Permutations();

        int multi[][] = { { 1, 2 } };
        System.out.println(call.check(2, 1, multi));

        multi = new int[][] { { 1, 2, 3, 4 }, { 4, 3, 1, 2 } };
        System.out.println(call.check(4, 2, multi));

        multi = new int[][] { { 1, 2, 3, 4 }, { 1, 3, 2, 4 } };
        System.out.println(call.check(4, 2, multi));

        multi = new int[][] { { 1, 6, 3, 4, 5, 2 }, { 6, 4, 2, 3, 1, 5 }, { 4, 2, 1, 5, 6, 3 }, { 4, 5, 1, 6, 2, 3 },
                { 3, 2, 5, 1, 6, 4 },
                { 2, 3, 6, 4, 1, 5 } };
        System.out.println(call.check(6, 6, multi));

        multi = new int[][] { { 3, 1, 4, 5, 6, 2 }, { 5, 3, 2, 4, 1, 6 }, { 5, 3, 6, 4, 2, 1 }, { 6, 5, 3, 2, 1, 4 },
                { 5, 4, 1, 2, 6, 3 },
                { 4, 1, 6, 2, 5, 3 } };
        System.out.println(call.check(6, 6, multi));
    }

}
