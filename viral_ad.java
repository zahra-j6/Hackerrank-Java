#https://www.hackerrank.com/challenges/strange-advertising/problem?h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class viral_ad {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int liked=2; // since they started with 5 ppl and 2 liked on the first day
        int cnt=liked;
        for(int i=1;i<n;i++){
            liked=(int)Math.floor((liked*3)/2); //everyday the number of ppl liked *3 
            cnt=cnt+liked;
            
        }
        return cnt;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
