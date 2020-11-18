package Hackerrank;


//incorrect
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Min_Swaps_2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int arr2[]=new int[arr.length];
        arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i])
                cnt++;
        }
        return cnt-1;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];


        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = minimumSwaps(arr);
        System.out.println(res);

          }
}
