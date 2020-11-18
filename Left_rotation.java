package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/array-left-rotation/problem
 class Left_rotation {

        /*
         * Complete the 'rotateLeft' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER d
         *  2. INTEGER_ARRAY arr
         */

        public static List<Integer> rotateLeft(int d, List<Integer> arr) {
            // Write your code here

            for(int i=0;i<d;i++){
                int val=arr.get(0);
                arr.remove(0);
                arr.add(arr.size(),val);
            }
            return arr;

        }



        public static void main(String[] args) throws IOException {
            List<Integer>arr=new ArrayList<>();
            for(int i=1;i<=5;i++)
                arr.add(i);
            List<Integer> result = rotateLeft(4, arr);
        }
    }

