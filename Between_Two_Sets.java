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
//https://www.hackerrank.com/challenges/between-two-sets/problem
class Between_Two_Sets {

        /*
         * Complete the 'getTotalX' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY a
         *  2. INTEGER_ARRAY b
         */

        public static int getTotalX(List<Integer> a, List<Integer> b) {
            // Write your code here
            int cnt=0;
            Collections.sort(a);
            Collections.sort(b);
            int to=1, from=b.get(0);
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=to;i<=from;i++){
                boolean ff=false;
                for(int j=0;j<a.size();j++){
                    if(i%a.get(j)==0)
                        ff=true;
                    else{
                        ff=false;
                        break;
                    }

                }
                if(ff==true)
                    arr.add(i);
            }
            for(int i=0;i<arr.size();i++){
                boolean ff=false;
                for(int j=0;j<b.size();j++){
                    if(b.get(j)%arr.get(i)==0)
                        ff=true;
                    else{
                        ff=false;
                        break;
                    }

                }
                if(ff==true)
                    cnt++;
            }
            return cnt;

        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            System.out.println(getTotalX(arr, brr));
}
        }


