package Hackerrank;//https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
// method different on hackerrank because of complexity issues but this method is correct too

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Manipulation {
    static long arrayManipulation(int n, int[][] q) {
        Long op[]=new Long[n];

        for(int i=0;i<n;i++)
            op[i]=(long)0;

        for(int i=0;i<q.length;i++){
            int a=q[i][0];
            int b=q[i][1];
            int c=q[i][2];


            for(int j=a-1;j<=b-1;j++) {
               // System.out.println(op[j]);
                op[j] = op[j] + c;
            }
        }
        Arrays.sort(op);
        return (long)op[n-1];


    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int n = sc.nextInt();
            int[][]q = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    q[i][j] = sc.nextInt();
                }
            }


        long result = arrayManipulation(t, q);
        System.out.println(result);


    }
}


