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

public class Diagonal_Difference {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here

            int r=arr.size();
            int c=arr.get(0).size();
            int sum1=0,sum2=0;
            for(int i=0;i<r;i++){ // sum of diagnol
                for(int j=0;j<c;j++){
                    if(i==j)
                        sum1+=arr.get(i).get(j);
                }
            }
            int k=0;
            for(int i=r-1;i>=0;i--){ //sum of secondary diagnol
                for(int j=0;j<c;j++){
                    if(i+j==r-1)
                        sum2+=arr.get(i).get(j);
                }
            }

            return Math.abs(sum1-sum2);

        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, n).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int result = diagonalDifference(arr);
            System.out.println(result);
        }
    }

