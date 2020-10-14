import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] q) {
        Long op[]=new Long[n+1];
        for(int i=0;i<n+1;i++)
            op[i]=(long)0;

        for(int i=0;i<q.length;i++){
            int a=q[i][0];
            int b=q[i][1];
            int c=q[i][2];
            op[a-1]+=c;
            op[b]-=c;

            
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += op[i];
            max = Math.max(max, sum);
        }
        return max;    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
