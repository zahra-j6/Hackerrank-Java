package Hackerrank;
//https://www.hackerrank.com/contests/world-codesprint-11/challenges/balanced-array/submissions/code/1328045677
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Balanced_Array {

        static int solve(int[] a){
            // Complete this function
            int mid=a.length/2;
            int l=0,r=0;
            for(int i=0;i<a.length;i++){
                if(i<mid){
                    l=l+a[i];
                }else{
                    r=r+a[i];
                }
            }
            if(l==r)
                return 0;
            else if(l>r)
                return Math.abs(r-l);
            else
                return Math.abs(l-r);
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int result = solve(a);
            System.out.println(result);
        }
    }
