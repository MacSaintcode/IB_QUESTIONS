package saintcoded;

import java.util.Arrays;

public class Permutations {

    boolean Permutation(int n, int m, int arr[][]) {
        // System.out.println(Arrays.toString(arr));
        

        
        for(;n>0;n--){
            int main=0;
            int divindex1=arr[main][n];
            int divindex2=arr[main][n+1];



        }

        return true;

    }

    public static void main(String[] args) {
        Permutations call = new Permutations();
        // int multi[][][] = { { { 6, 7 }, { 7, 6 } }, { { 19, 7 }, { 15, 6 } } };
        System.out.println(call.Permutation(2, 1, new int[][]{{ 6, 7 }, { 7, 6 } }));
    }

}
