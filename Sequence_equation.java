#https://www.hackerrank.com/challenges/permutation-equation/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sequence_equation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        // basically do 
        //1. a= p[1]
        //2. b=p[a]
        //3. save b
        int []arr=new int[p.length];
            ArrayList<String> a=new ArrayList<>();
            for(int i=0;i<p.length;i++) // converting int array to arraylist
                a.add(Integer.toString(p[i]));

            for(int i=1;i<=p.length;i++){
                int index1= a.indexOf(Integer.toString(i));// finding the index of 1-->2-->3....
                index1=a.indexOf(Integer.toString(index1+1));//then finding the index of p[index]
                int val=(int)index1;
                arr[i-1]=val+1;
// all values are added by 1 as we start i from 1 while java finds values from 0


            }
            return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
