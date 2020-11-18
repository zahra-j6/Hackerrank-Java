package Hackerrank;

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
//https://www.hackerrank.com/challenges/equal-stacks/problem
//2 cases fail for TLE
public class Equal_Stacks {

        /*
         * Complete the 'equalStacks' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY h1
         *  2. INTEGER_ARRAY h2
         *  3. INTEGER_ARRAY h3
         */

        public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
            // Write your code here
            PriorityQueue<Integer> l1=new PriorityQueue<>(Collections.reverseOrder());
            Collections.reverse(h1);
            int sum=0;
            for(int i=0;i<h1.size();i++){
                sum+=h1.get(i);
                l1.add(sum);
            }
            PriorityQueue<Integer> l2=new PriorityQueue<>();
            Collections.reverse(h2);
            sum=0;
            for(int i=0;i<h2.size();i++){
                sum+=h2.get(i);
                l2.add(sum);
            }
            PriorityQueue<Integer> l3=new PriorityQueue<>();
            Collections.reverse(h3);
            sum=0;
            for(int i=0;i<h3.size();i++){
                sum+=h3.get(i);
                l3.add(sum);
            }
            for(int i=0;i<l1.size();i++){
                int val=l1.poll();
                if(l2.contains(val) && l3.contains(val))
                    return val;
            }
            return 0;
        }





        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n1 = Integer.parseInt(firstMultipleInput[0]);

            int n2 = Integer.parseInt(firstMultipleInput[1]);

            int n3 = Integer.parseInt(firstMultipleInput[2]);

            List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = equalStacks(h1, h2, h3);
            System.out.println(result);
           }
    }

