package Hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Breaking_the_Records {

        // Complete the breakingRecords function below.
        static int[] breakingRecords(int[] scores) {
            int max=scores[0];
            int res[]=new int[2];
            int cnt=0;
            for(int i=1;i<scores.length;i++){
                if(max<scores[i]){
                    cnt++;
                    max=scores[i];
                }
            }
            res[0]=cnt;
            cnt=0;
            int min=scores[0];
            for(int i=1;i<scores.length;i++){
                if(min>scores[i]){
                    cnt++;
                    min=scores[i];
                }
            }
            res[1]=cnt;
            return res;



        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] scores = new int[n];

            String[] scoresItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int scoresItem = Integer.parseInt(scoresItems[i]);
                scores[i] = scoresItem;
            }

            int[] result = breakingRecords(scores);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

