package Hackerrank;
//https://www.hackerrank.com/challenges/counting-valleys/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Counting_Valleys {

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */

        public static int countingValleys(int steps, String path) {
            // Write your code here
            char arr[]=path.toCharArray();
            int cnt=0;
            int s=0;
            char val=arr[0];
            for(int i=0;i<steps;i++){
                if(arr[i]=='D')
                    s--;
                if(arr[i]=='U' )
                    s++;
                if(s==0 && val=='D') {
                    cnt++;
                    if(i+1<steps)
                        val=arr[i+1];
                }
                if(s==0 && i+1<steps)
                    val=arr[i+1];
            }
            return cnt;

        }


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int steps = Integer.parseInt(bufferedReader.readLine().trim());

            String path = bufferedReader.readLine();

            int result = countingValleys(steps, path);

            System.out.println(result);
        }
    }

